package com.softwaretestingo.array;
import java.util.Arrays;
public class ArraysSort01 {
	public static void main(String[] args) 
	{
		int[] numbers = { 8, 2, 7, 3, 1, 5 };
		// sort an array using Arrays.sort
		Arrays.sort(numbers);

		System.out.println("Sorted Numbers:");
		for (int number : numbers) {
			System.out.println(number);
		}
	}
}