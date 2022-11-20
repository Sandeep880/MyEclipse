package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.entities.Student;
import com.springjdbc.dao.StudentDao;
import com.springjdbc.dao.StudentDaoImpl;
public class Test {

	public static void main(String[] args) {
		System.out.println("My Program is started");
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
		
	
 /*       
 // For inserting Query 
		Student student =new Student();
		student.setId(102);
		student.setName("ShivNaryana Kumar");
		student.setCity("Saidpur");
		
		int result = studentDao.insert(student);
		
		System.out.println("student is inserted--" + result);
		
*/		
	/*	
	//	For updating Query
	 
		Student student1 = new Student();
		student1.setId(102);
		student1.setName("Dilip Kumar");
		student1.setCity("Delhi");
		
		Student student2= new Student();
		student2.setId(103);
		student2.setName("ShivNaryana Kumar");
		student2.setCity("Pahelejaghat");
		
		int r1 = studentDao.updates(student1);
		int r2 = studentDao.updates(student2);
		
		System.out.println(r1);
		System.out.println(r2);
		
	*/
		
	/*
		int res= studentDao.delete(1234);
		System.out.println("Rows is deleted -- " + res);
		
	*/
//		Student student = studentDao.getStudent(104);
//		System.out.println(student);
		
		List<Student> students = studentDao.getAllStudent();
		for(Student s:students)
			System.out.println(s);
		
		
	}

}
