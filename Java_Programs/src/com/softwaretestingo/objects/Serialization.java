package com.softwaretestingo.objects;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Serialization 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Serialization Example
	 * 
	 */
	public static void main(String[] args) 
	{
		Student sd=new Student();
		sd.name="Ramesh";
		sd.id=101;

		try
		{
			FileOutputStream fileOut = new FileOutputStream("student.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(sd);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in student.ser");
		} 
		catch (IOException i)
		{
			i.printStackTrace();
		}
	}
}