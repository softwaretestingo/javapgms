package com.softwaretestingo.array;

public class ArrayInitializeUsingConstructorEx 
{
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