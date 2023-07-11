package com.softwaretestingo.objects;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class CreateObjectEx3  implements Serializable
{
	// Member variables
	private String name;
	CreateObjectEx3(String name)
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
			CreateObjectEx3 obj=new CreateObjectEx3("SoftwareTestingo");
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