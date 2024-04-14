package com.softwaretestingo.exception;
import java.util.ArrayList;
// Create A Unchecked Custom exception
class customexception2 extends RuntimeException
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Custom Unchecked Exception
	 * 
	 */
	public customexception2(String message) 
	{
		// Call the Constructor of RuntimeException Class
		super(message);
	}
}
public class UncheckedCustomExceptionEx2 
{
	//Create an ArrayList to Store List Of Students
	ArrayList<String> student=new ArrayList<>();

	//Try to Add Students into the ArrayList
	public void addStudent(String name) throws customexception2
	{
		// If the Name is already available in the Student list then throw exception
		if(student.contains(name))
		{
			throw new customexception2(name + " Already Present in the List");
		}
		else
		{
			//Add the Name into the List
			student.add(name);
			System.out.println(name + " Added Into the Student List");
		}
	}

	public static void main(String[] args) 
	{
		UncheckedCustomExceptionEx2 obj=new UncheckedCustomExceptionEx2();

		//Calling Method to Add the Student
		/* During adding the Student there is chance of Exception 
		so we are using try catch statements*/
		obj.addStudent("Harish");
		obj.addStudent("Sonali");
		obj.addStudent("Bala");
		obj.addStudent("Harish");
	}
}