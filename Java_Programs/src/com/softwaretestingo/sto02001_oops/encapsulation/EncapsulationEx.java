package com.softwaretestingo.sto02001_oops.encapsulation;
public class EncapsulationEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Encapsulation Example
	 * 
	 */
	private String name;
	private int age;

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}
	public static void main(String[] args) 
	{
		EncapsulationEx obj=new EncapsulationEx();

		//Set the Value
		obj.setName("Ramesh");
		obj.setAge(20);

		//Print The Value
		System.out.println("The User Name is: "+obj.getName());
		System.out.println("The User Age is: "+obj.getAge());
	}
}