package com.softwaretestingo.objects;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Deserialization 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Deserialization Example
	 * 
	 */
	public static void main(String[] args) 
	{
		Student sd = null;
		try
		{
			FileInputStream fileIn = new FileInputStream("student.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			sd = (Student) in.readObject();
			in.close();
			fileIn.close();
		} 
		catch (Exception ex)
		{
			System.out.println("Employee class not found");
			ex.printStackTrace();
			return;
		}
		System.out.println("Deserialized Employee...");
		System.out.println("Name: " + sd.name);
		System.out.println("Id: " + sd.id);
	}
}