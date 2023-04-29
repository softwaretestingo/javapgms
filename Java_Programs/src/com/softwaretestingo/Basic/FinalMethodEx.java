package com.softwaretestingo.Basic;
class Show
{
	//final method
	public final void show()
	{
		System.out.println("Inside final method");
	}
}
class FinalMethodTest extends Show
{
	//try to override final method
	/*
	 * public void show() { System.out.println("Inside overridden final method"); }
	 */
}
public class FinalMethodEx 
{
	public static void main(String[] args)
	{
		//creating object of FinalMethodTest Class
		FinalMethodTest obj = new FinalMethodTest();
		//method call
		obj.show();
	}
}