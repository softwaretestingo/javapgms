package com.softwaretestingo.sto011_STRINGS;
class ex11
{  
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Result With Out Using this Keyword
	 * 
	 */
	int rollno;  
	String name;  
	int fee;  
	ex11(int rollno,String name,int fee)
	{  
		rollno=rollno;  
		name=name;  
		fee=fee;  
	}  
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}  
}  
public class WithOutThisKeywordEx1 
{
	public static void main(String[] args) 
	{
		ex11 obj=new ex11(123, "Testing", 7895);
		obj.display();
	}
}