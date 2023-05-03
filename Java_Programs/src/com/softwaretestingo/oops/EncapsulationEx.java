package com.softwaretestingo.oops;
public class EncapsulationEx 
{
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