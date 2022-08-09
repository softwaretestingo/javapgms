package com.softwaretestingo.basic;
public class OddandEvenNumber 
{
	public static void main(String[] args) 
	{
		int x=5;
		// 4/2-0
		// 3/2-1
		int reminder=x%2;
		if(reminder==1)
		{
			System.out.println("Odd number");
		}
		else
		{
			System.out.println("Even number");
		}
	}
}