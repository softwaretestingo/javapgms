package com.softwaretestingo.Basic;
class PQR
{
	public void display()
	{
		System.out.println("Public Method Of Other Class Executed");
	}
}
public class PublicAccessModifiers_Example 
{
	public static void main(String[] args) 
	{
		PQR obj=new PQR();
		obj.display();
	}
}