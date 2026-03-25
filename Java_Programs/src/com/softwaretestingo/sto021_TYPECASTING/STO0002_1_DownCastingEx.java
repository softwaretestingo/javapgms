package com.softwaretestingo.sto021_TYPECASTING;

//Parent Class
class Flower 
{
	void smell()
	{
		System.out.println("Flower Class Smell Method");
	}
}

class Rose extends Flower 
{
	void smell() 
	{
		System.out.println("Rose Class Smell Method");
	}
}

public class STO0002_1_DownCastingEx 
{
	public static void main(String[] args) 
	{
		Flower obj = new Rose();
		Rose DownCastObj = (Rose) obj;

		// With Downcast We Can able to Call Child Class method from Parent Class
		DownCastObj.smell();
	}
}