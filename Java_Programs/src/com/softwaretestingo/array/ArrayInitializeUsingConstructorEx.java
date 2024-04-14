package com.softwaretestingo.array;
public class ArrayInitializeUsingConstructorEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Initialize an Array By Using Constructor
	 * 
	 */
	public static int arr[];

	public ArrayInitializeUsingConstructorEx(int a[])
	{
		this.arr=a;
	}
	public static void main(String[] args) 
	{
		ArrayInitializeUsingConstructorEx obj=new ArrayInitializeUsingConstructorEx(new int[] {10,20,30,40,50});
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}