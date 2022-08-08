package com.softwaretestingo.packageexamples;
import myPackage.*;
public class Use_UDPForMulti 
{
	public static void main(String[] args)
	{
		// Accessing Add method of Add Class
		Add obj = new Add();
		System.out.println("Sum Of Two Numbers: "+obj.add(100, 200));
		// Accessing Multiplication method of Multi Class
		Multi obj1=new Multi();
		System.out.println("Multiplication Of Two Numbers: "+obj1.multiplication(20, 30));
	}
}