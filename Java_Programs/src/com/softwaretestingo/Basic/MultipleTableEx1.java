package com.softwaretestingo.Basic;
public class MultipleTableEx1
{
	public static void main(String[] args) 
	{
		//Print the 5th table
		multi(5,10);
	}
	static void multi(int n,int range)
	{
		for(int i=1;i<=range;i++)
		{
			System.out.println(n +"*" + i +"=" +(n*i));
		}
	}
}