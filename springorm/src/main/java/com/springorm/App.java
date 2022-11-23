package com.springorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.entities.Student;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {

        Scanner s= new Scanner(System.in);    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
    	StudentDao studentDao= context.getBean("studentDao", StudentDao.class);
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	boolean go = true;
    	while(go)
    	{
    		System.out.println("PRESS 1 For add new Student");
    		System.out.println("PRESS 2 For display all Student");
    		System.out.println("PRESS 3 For get details for Single Student");
    		System.out.println("PRESS 4 For delete Student");
    		System.out.println("PRESS 5 For update Student");
    		System.out.println("PRESS 6 For Exit");
    		
    		System.out.println("Press Any Digit from Above List");
    		int input=s.nextInt();
    		
			switch (input) {
			case 1:
				// Inserting New Student
				Student student = new Student();
				System.out.println("Enter the Student ID :");
				int uId= Integer.parseInt(br.readLine());
				student.setStudentId(uId);
				
				System.out.println("Enter the Student Name :");
				String uName= br.readLine();
				student.setStudentName(uName);
				
				System.out.println("Enter the Student City :");
				String uCity= br.readLine();
				student.setStudentCity(uCity);
				
				int r = studentDao.insert(student);
				System.out.println(r+ "Student Added SuccessFully");
				System.out.println("*******************************************************");
				break;
			case 2:
				// Displaying ALL Student Details
				System.out.println("*********************************************************");
				List<Student> allStudent = studentDao.getAllStudent();
				for(Student st : allStudent)
					{
					    System.out.println("Name :" + st.getStudentName());
				        System.out.println("Id : " + st.getStudentId() );
				        System.out.println("City : " + st.getStudentCity());
				        System.out.println("------------------------------------------------");
					}
				System.out.println("*********************************************************");
				break;
			case 3:
				// Displaying Single Student Details
				System.out.println("***************************************************");
				System.out.println("Enter the student id for which you want information");
				int id=s.nextInt();
				Student userIdDetails=studentDao.getStudent(id);
				System.out.println("Name : "+ userIdDetails.getStudentName());
				System.out.println("Id : " + userIdDetails.getStudentId());
				System.out.println("City : "+ userIdDetails.getStudentCity());
				System.out.println("**********************************************************");
				break;
			case 4:
				// Deleting Student rows
				System.out.println("***********************************************************");
				System.out.println("Enter the Student Id Details for Deleting Rows");
				int uid=s.nextInt();
				studentDao.deleteStudent(uid);
				System.out.println("Student details is deleting ..........");
				break;
			case 5:
				// Updating Student details
				System.out.println("**********************************************************");
			    System.out.println("Enter the Student ID which details are you want to change");
			    int userId=s.nextInt();
			    Student studentDetails= studentDao.getStudent(userId);
			    System.out.println("What you want to change : name or city ?");
			    String var=br.readLine();
			    if(var == "name" )
			    {
			    	System.out.println("Enter the updated name for Student Id");
			    	String name= br.readLine();
			    	studentDetails.setStudentName(name);
			    	studentDao.updateStudent(studentDetails);
			    	System.out.println("Student Name is updated ---");
			    	System.out.println("*****************************************");
			    }
			    else
			    {
			    	System.out.println("Enter the updated city for Student Id");
			    	String city=br.readLine();
			    	studentDetails.setStudentCity(city);
			    	studentDao.updateStudent(studentDetails);
			    	System.out.println("Student City is updated ---");
			    	System.out.println("*****************************************");
			    }
				break;
			case 6:
				go = false;
				break;
				

			default:
				break;
			}
    	}
    	
    	
    	
    	
    }
}
