package com.softwaretestingo.sto01005_arraysprograms;
import java.util.Arrays;
import java.util.List;
public class STO0002_EvenAndOddNumbersInArray 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find the Odd and Even Numbers Of the Array
	 * 
	 */
    public static void main(String[] args) 
    {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};

        //Extracting even numbers
        for (int i = 0; i < a.length - 1; i++) 
        {
            if (a[i] % 2 == 0) {
                System.out.println("Even numbers in array are " + a[i]);
            }

            //Extracting odd numbers
            for (int j = 0; j < a.length - 1; j++) 
            {
                if (a[j] % 2 != 0) 
                {
                    System.out.println("Odd numbers in array are " + a[j]);
                }
            }

            //Using Java Streams
            List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
            arrayList.stream().filter(s -> s % 2 == 0).forEach(s -> System.out.println("Even numbers from Array " + s));

            List<Integer> arrayList2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
            arrayList.stream().filter(s -> s % 2 != 0).forEach(s -> System.out.println("Odd numbers from Array " + s));
        }
    }
}