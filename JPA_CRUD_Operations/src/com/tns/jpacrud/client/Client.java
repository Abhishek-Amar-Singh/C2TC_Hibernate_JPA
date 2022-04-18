package com.tns.jpacrud.client;

import com.tns.jpacrud.entities.Student;
import com.tns.jpacrud.service.StudentService;
import com.tns.jpacrud.service.StudentServiceImpl;

public class Client
{
	public static void main(String[] args)
	{
		//Debug this program as Debug -> Debug as Java Application
		StudentService service = new StudentServiceImpl();//..lazy binding
		Student student = new Student();

		// Create Operation
		student.setStudentId(10);
		student.setName("Sachin");
		student.setCity("Mumbai");
		service.addStudent(student);
		Console.log("create operation completed.");
		
		//at this breakpoint, we have added one record to table
		// Retrieve Operation
		student = service.findStudentById(10);
		System.out.println("Retrieving records:");
		System.out.println("ID - " + student.getStudentId());
		System.out.println("Name - " + student.getName());
		System.out.println("City - " + student.getCity());
		Console.log("retrieve operation completed.");
		
		// Update Operation
		student = service.findStudentById(10);
		student.setName("Sachin Tendulkar");
		service.updateStudent(student);
		Console.log("update operation completed.");
		
		// Retrieve Operation
		student = service.findStudentById(10);
		System.out.println("Retrieving records:");
		System.out.println("ID - " + student.getStudentId());
		System.out.println("Name - " + student.getName());
		System.out.println("City - " + student.getCity());
		Console.log("after updation, retrieve operation completed.");
		
		//at this breakpoint, record is removed from table
		// Delete Operation
		student = service.findStudentById(10);
		service.removeStudent(student);
		Console.log("delete operation completed.");
		Console.log("end of program or life cycle completed!");
	}
}

class Console
{
    public static void log(Object obj)
    {
        System.out.println(obj);
    }
}