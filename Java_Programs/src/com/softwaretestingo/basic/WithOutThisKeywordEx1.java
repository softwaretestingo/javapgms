package com.softwaretestingo.basic;
class ex11
{  
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