package com.tnsif.client;
import com.tnsif.entity.Student;
import com.tnsif.service.StudentService;
import com.tnsif.service.StudentServiceImpl;
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Debug this program as Debug -> Debug as JavaApplication
		StudentService service = new StudentServiceImpl();
		Student student = new Student();
		// Create Operation
		student.setStudentId(100);
		student.setName("Sachin");
		service.addStudent(student);
		//at this breakpoint, we have added one record to table
		// Retrieve Operation
		student = service.findStudentById(100);
		System.out.print("ID:"+student.getStudentId());
		System.out.println(" Name:"+student.getName());
		// Update Operation
		student = service.findStudentById(100);
		student.setName("Sachin Tendulkar");
		service.updateStudent(student);
		//at this breakpoint, we have updated record added in first section
		student = service.findStudentById(100);
		System.out.print("ID:"+student.getStudentId());
		System.out.println(" Name:"+student.getName());
		//at this breakpoint, record is removed from table
		// Delete Operation
		student = service.findStudentById(100);
		service.removeStudent(student);
		System.out.println("End of program/Life cycle completed...");
		}
		
	}

}
