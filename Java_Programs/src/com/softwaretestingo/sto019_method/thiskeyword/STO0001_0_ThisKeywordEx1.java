package com.softwaretestingo.sto019_method.thiskeyword;
class ex1
{  
	/**
	 * Author: SoftwareTestingo Admin User
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Use Of This Keyword
	 * 
	 */
	int rollno;  
	String name;  
	int fee;  
	ex1(int rollno,String name,int fee)
	{  
		this.rollno=rollno;  
		this.name=name;  
		this.fee=fee;  
	}  
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}  
}  
public class STO0001_0_ThisKeywordEx1 
{
	public static void main(String[] args) 
	{
		ex1 obj=new ex1(123, "Testing", 7895);
		obj.display();
	}
}