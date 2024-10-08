package com.softwaretestingo.sto028_EXCEPTIONHANDLING;
import java.util.ArrayList;
// Create A Checked Custom exception
class customexception1 extends Exception
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Custom Checked Exception Example
	 * 
	 */
	public customexception1(String message) 
	{
		// Call the Constructor of Exception Class
		super(message);
	}
}
public class STO0001_0_CheckedCustomExceptionEx1 
{
	//Create an ArrayList to Store List Of Students
	ArrayList<String> student=new ArrayList<>();

	//Try to Add Students into the ArrayList
	public void addStudent(String name) throws customexception1
	{
		// If the Name is already available in the Student list then throw exception
		if(student.contains(name))
		{
			throw new customexception1(name + " Already Present in the List");
		}
		else
		{
			//Add the Name into the List
			student.add(name);
			System.out.println(name + " Added Into the Student List");
		}
	}

	public static void main(String[] args) throws customexception1 
	{
		STO0001_0_CheckedCustomExceptionEx1 obj=new STO0001_0_CheckedCustomExceptionEx1();

		//Calling Method to Add the Student
		/* During adding the Student there is chance of Exception 
		so we are using try catch statements*/
		try 
		{
		obj.addStudent("Harish");
		obj.addStudent("Sonali");
		obj.addStudent("Bala");
		obj.addStudent("Harish");
		}
		catch (customexception1 e)
		{
			System.out.println("[" + e + "] Exception Occured");
		}
	}
}