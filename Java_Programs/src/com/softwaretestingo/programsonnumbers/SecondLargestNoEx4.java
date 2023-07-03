package com.softwaretestingo.programsonnumbers;
import java.util.Arrays;
import java.util.Scanner;
public class SecondLargestNoEx4 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size :");
		Integer numberOfElements = scanner.nextInt();
		int arr[] = new int[numberOfElements];
		System.out.println("Enter array elements :");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = scanner.nextInt();
		}
		System.out.println("Array elements are" + Arrays.toString(arr));
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] > largest) 
			{
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) 
			{
				secondLargest = arr[i];
			}
		}
		if (secondLargest == Integer.MIN_VALUE) 
		{
			System.out.println("There is no second highest/largest element in the array");
		} else 
		{
			System.out.println("Second highest element in array is :" + secondLargest);
		}
		scanner.close();
	}
}