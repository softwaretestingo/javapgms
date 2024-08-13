package com.softwaretestingo.sto015_object;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class STO0001_2_CreateObjectEx3  implements Serializable
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Create Object Using writeObject() method example
	 * 
	 */
	// Member variables
	private String name;
	STO0001_2_CreateObjectEx3(String name)
	{
		// This keyword refers to current object itself
		this.name = name;
	}
	public static void main(String[] args) throws CloneNotSupportedException
	{
		FileOutputStream fout = null;
		ObjectOutputStream obj1 = null;
		try 
		{
			STO0001_2_CreateObjectEx3 obj=new STO0001_2_CreateObjectEx3("SoftwareTestingo");
			fout = new FileOutputStream("test.txt");
			obj1 = new ObjectOutputStream(fout);
			obj1.writeObject(obj);
			obj1.close();
			
			// Freeing up memory resources
			obj1.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("Objects Created");
	}
}