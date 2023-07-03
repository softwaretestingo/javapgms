package com.softwaretestingo.basic;

public class LocalVariable 
{
	String myVar="Outside Local Test Method";
	//Local Method
	public void localTestMethod()
	{
		String localvar="Inside Local Test Method";
		System.out.println("Local Variable str Value:-"+localvar);
	}
	public static void main(String[] args) 
	{
		LocalVariable obj=new LocalVariable();
		obj.localTestMethod();
		//System.out.println(obj.localvar);
		System.out.println("Variable Value Outside Method:-"+obj.myVar);
	}
}