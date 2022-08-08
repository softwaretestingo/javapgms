package com.softwaretestingo.packageexamples;
public class Use_FullyqualifiedName 
{
	public static void main(String[] args) 
	{
		// using fully qualified name  
		myPackage.Add obj=new myPackage.Add();
		System.out.println("Sum Of Two numbers: "+ obj.add(11, 22));
	}
}