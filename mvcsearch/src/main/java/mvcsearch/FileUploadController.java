package mvcsearch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	
	@RequestMapping("/book/{id}/{userName}")
	public String handler(@PathVariable("id") int id,@PathVariable("userName") String userName  ) {
		
		System.out.println(id);
		System.out.println(userName);
		return "pathsuccess";
	}
	
	@RequestMapping("/fileform")
	public String showUploadForm() {
		
		return "fileForm";
	}
	
	@RequestMapping(value="/uploadimage",method=RequestMethod.POST)
	public String fileupload(@RequestParam("profile") CommonsMultipartFile file, HttpSession s, Model m) {
		
		System.out.println("file upload handler");
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		
		System.out.println("*******************************");
		
		
		// get the byte data 
		byte[] data = file.getBytes();
		
		
		/*
		 * we have to save this file to server we required the http servlet session to
		 * get real path of the file
		 */
		
		String path = s.getServletContext().getRealPath("/")+ "WEB-INF" +File.separator + "resources"+ File.separator + "image" +File.separator + file.getOriginalFilename() ;
		System.out.println(path);
		try {
			/* To write in the file we use the FileOutput Stream
			 * Java FileOutputStream is an output stream used for writing data to a file.
			  
			 *  */ 
			FileOutputStream fos=new FileOutputStream(path);
			  fos.write(data);
			  fos.close();
			  m.addAttribute("msg","Uploading successfully");
			  m.addAttribute("filename",file.getOriginalFilename());
			  
		} catch (IOException e) {
			 System.out.println("Uploading Error");
			 m.addAttribute("msg", "Uploading Error");
		}
		
		return "filesuccess";
		
	}

}
