package com.softwaretestingo.string;
import java.util.Arrays;
public class ArraytoStringEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Convert Array to String
	 * 
	 */
	public static void main(String[] args) 
	{
		boolean[] boolArray = new boolean[] { false, true, false, false }; 
		System.out.println("String of boolean Array: "+Arrays.toString(boolArray));

		byte[] byteArray = new byte[] { 42, 60, 10 };         
		System.out.println("String of byte Array: "+Arrays.toString(byteArray)); 

		char[] charArray = new char[] {'s', 't', 'u', 'd', 'y', 't', 'o', 'n', 'i', 'g', 'h', 't'}; 
		System.out.println("String of char Array: "+Arrays.toString(charArray)); 

		double[] doubleArray = new double[] { 4.4, 1.1, 2.2, 6.6 }; 
		System.out.println("String of double Array: "+Arrays.toString(doubleArray)); 

		float[] floatArray = new float[] { 1f, 3f, 6f, 9f }; 
		System.out.println("String of float Array: "+Arrays.toString(floatArray)); 

		int[] intArray = new int[] { 1, 2, 3, 4 }; 
		System.out.println("String of int Array: "+Arrays.toString(intArray)); 

		long[] longArray = new long[] { 9, 8, 7, 6, 5 }; 
		System.out.println("String of long Array: "+Arrays.toString(longArray)); 

		Object[] objectArray = new Object[] {4, 5, 3, 7, 9}; 
		System.out.println("String of Object Array: "+Arrays.toString(objectArray)); 

		short[] shortArray = new short[] { 1, 2, 3, 4 }; 
		System.out.println("String of short Array: "+Arrays.toString(shortArray));
	}
}