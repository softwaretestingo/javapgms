package com.softwaretestingo.thiskeyword;
class ex1
{  
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
public class ThisKeywordEx1 
{
	public static void main(String[] args) 
	{
		ex1 obj=new ex1(123, "Testing", 7895);
		obj.display();
	}
}