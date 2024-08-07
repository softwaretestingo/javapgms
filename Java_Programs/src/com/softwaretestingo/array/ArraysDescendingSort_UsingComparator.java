package com.softwaretestingo.array;
import java.util.Arrays;
import java.util.Comparator;
public class ArraysDescendingSort_UsingComparator 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Sort an Array By Using Built in Methods of Java Arrays.Sort() 
	 *
	 */
	public static void main(String[] args) 
	{
		Integer[] numbers = {8, 2, 7, 3, 1, 5};
        //sort an Array using Arrays.sort
        Arrays.sort(numbers, Comparator.reverseOrder());

        System.out.println("Sorted Numbers (Descending):");
        for (int number : numbers) 
        {
            System.out.println(number);
        }
	}
}