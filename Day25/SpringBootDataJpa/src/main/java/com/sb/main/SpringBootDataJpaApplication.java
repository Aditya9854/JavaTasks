package com.sb.main;

import com.sb.main.repository.StudentRepository;
import com.sb.main.services.StudentServiceImpl;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.sb.main.entities.Student;
import com.sb.main.services.StudentService;

@SpringBootApplication
public class SpringBootDataJpaApplication 
{

	private final StudentServiceImpl studentServiceImpl;
	private final StudentRepository studentRepository;

	SpringBootDataJpaApplication(StudentRepository studentRepository, StudentServiceImpl studentServiceImpl) {
		this.studentRepository = studentRepository;
		this.studentServiceImpl = studentServiceImpl;
	}

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringBootDataJpaApplication.class, args);
		
		StudentService stdService = context.getBean(StudentService.class);
		
		//---------Insert Operation--------------
//		Student std = new Student();
//		std.setName("Amit");
//		std.setRollno(1002);
//		std.setMarks(95.5f);
//		
//		boolean status = stdService.addStudentDetails(std);
//		
//		if(status) {
//			System.out.println("Student Details inserted successfully!");
//		}
//		else {
//			System.out.println("Student Details not inserted due to some error!");
//			
//		}
		
//		//------------Select operation--------
//		List<Student> stdList =  stdService.getAllStdDetails();
//		for(Student std : stdList)
//		{
//			System.out.println("Id : "+std.getId());
//			System.out.println("Name : "+std.getName());
//			System.out.println("Rollno : "+std.getRollno());
//			System.out.println("Marks : "+std.getMarks());
//			
//			System.out.println("----------------------------");
//		}
		
		//--------------Select operation2-----------
//		Student std = stdService.getStudentDetails(2L);
//		
//		if(std != null)
//		{
//			System.out.println("Id : "+std.getId());
//			System.out.println("Name : "+std.getName());
//			System.out.println("Rollno : "+std.getRollno());
//			System.out.println("Marks : "+std.getMarks());
//			
//		}
//		else
//		{
//			System.out.println("Student not found..!");
//		}
		
		//---------Update Operation---------------
//		boolean status = stdService.updateStdDetails(1L, 90.7f);
//		
//		if(status)
//		{
//			System.out.println("Student Details updated Successfully!");
//		}
//		else
//		{
//			System.out.println("Student Details not updated due to some error!");
//		}
		
		//-------------------Delete Operation----------
        boolean status = stdService.deleteStdDetails(2L);
		
		if(status)
		{
			System.out.println("Student Details deleted Successfully!");
		}
		else
		{
			System.out.println("Student Details not deleted due to some error!");
		}
		
	}
}
