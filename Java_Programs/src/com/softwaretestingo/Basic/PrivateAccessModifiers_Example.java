package com.softwaretestingo.Basic;
class ABCa
{  
	private double num = 100;
	private int square(int a)
	{
		return a*a;
	}
}  
public class PrivateAccessModifiers_Example 
{
	public static void main(String[] args) 
	{
		ABCa obj = new ABCa();  
		//System.out.println(obj.num); 
		//System.out.println(obj.square(10));
	}
}