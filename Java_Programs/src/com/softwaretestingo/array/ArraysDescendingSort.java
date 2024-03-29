package com.softwaretestingo.array;
import java.util.Arrays;
import java.util.Comparator;
public class ArraysDescendingSort {
	public static void main(String[] args) 
	{
		Integer[] numbers = {8, 2, 7, 3, 1, 5};
        //sort an Array using Arrays.sort
        Arrays.sort(numbers, Comparator.reverseOrder());

        System.out.println("Sorted Numbers (Descending):");
        for (int number : numbers) {
            System.out.println(number);
        }
	}
}