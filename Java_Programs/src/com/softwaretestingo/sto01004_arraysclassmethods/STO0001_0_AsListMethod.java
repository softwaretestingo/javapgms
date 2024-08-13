package com.softwaretestingo.sto01004_arraysclassmethods;
import java.util.Arrays;
import java.util.List;
public class STO0001_0_AsListMethod 
{
	public static void main(String[] args) 
	{
		/**
		 * When you work with primitive data types It will print the address because the
		 * type of array must be wrapper clas not primitive data type
		 */
		System.out.println("---------- Working With Primitve Data Types ---------");
		int arr1[] = new int[] { 10, 20, 30, 40, 50 };
		List<int[]> intList1 = Arrays.asList(arr1);
		// This Will Print the Address Not Values
		System.out.println(intList1);

		System.out.println("---------- Working With Wrapper Class ---------");
		Integer arr[] = new Integer[] { 10, 20, 30, 40, 50 };
		List<Integer> intList = Arrays.asList(arr);
		System.out.println(intList);

		String str[] = { "SoftwareTestingo", "Blog" };
		List<String> st = Arrays.asList(str);
		System.out.println(st);
	}
}