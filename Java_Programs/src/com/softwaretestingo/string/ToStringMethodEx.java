package com.softwaretestingo.string;
public class ToStringMethodEx 
{
	String firstName;
    String lastName;
    int age;
    
    ToStringMethodEx(String firstName,String lastName,int age)
    {
    	this.firstName=firstName;
    	this.lastName=lastName;
    	this.age=age;
    }
	public static void main(String[] args) 
	{
		ToStringMethodEx obj=new ToStringMethodEx("Ramesh", "Dixit",20);
		ToStringMethodEx obj1=new ToStringMethodEx("Anmol", "Arora",30);
		
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println(obj1.toString());
	}
}