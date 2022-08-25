package com.softwaretestingo.Inheritance;
class classAA
{
	public void displayA()
	{
		System.out.println("Class A Method");
	}
}
class classBB extends classAA
{
	public void show()
	{
		System.out.println("Show Method Of Class B");
	}
	public void displayB()
	{
		System.out.println("Class B Method");
	}
}
class classCD extends classAA
{
	public void show()
	{
		System.out.println("Show Method Of Class C");
	}
	public void display()
	{
		System.out.println("Class C Method");
	}
}
public class Hybrid_Inheritance extends classBB //, classC
{
	public void dislay_localclass()
	{
		System.out.println("Display() method of Local Class");
	}
	public static void main(String[] args) 
	{
		Hybrid_Inheritance obj=new Hybrid_Inheritance();
		obj.dislay_localclass();
		obj.show(); //When this statement executed it give you error
	}
}