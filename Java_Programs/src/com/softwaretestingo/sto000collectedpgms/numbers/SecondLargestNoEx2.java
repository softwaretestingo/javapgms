package com.softwaretestingo.sto000collectedpgms.numbers;
import java.util.Arrays;
public class SecondLargestNoEx2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find The Second Largest Number From Array
	 * 
	 */
	public static void main(String[] args) 
	{
		int array[] = {10, 20, 25, 63, 96, 57};
		int size = array.length;
		Arrays.sort(array);
		System.out.println("sorted Array ::"+Arrays.toString(array));
		int res = array[size-2];
		System.out.println("2nd largest element is ::"+res);
	}
}