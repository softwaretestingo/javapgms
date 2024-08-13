package com.softwaretestingo.sto00704_controlstatements.forloop.examples;
public class MultipleTableEx1
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Multiplication Table Example
	 * @param args
	 */
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