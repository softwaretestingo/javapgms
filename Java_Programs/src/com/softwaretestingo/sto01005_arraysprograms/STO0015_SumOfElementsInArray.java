package com.softwaretestingo.sto01005_arraysprograms;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class STO0015_SumOfElementsInArray 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Sum of Array Elements Using For, ForEach Loop & Stream
	 * 
	 */
    public static void main(String[] args)
    {

       int array[]={5,2,3,7,8};
       int sum=0, sum1=0;

       //Using for Loop
       for (int i=0;i<array.length;i++)
       {
         sum=sum+array[i];
       }
       System.out.println("Sum of elements in array from for Loop "+sum);

       //Using forEach Loop
        for(int i:array)
        {
            sum1=sum1+i;
        }
        System.out.println("Sum of elements in array from for Each Loop "+sum1);

        //using streams
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum2=integers.stream().reduce( (a, b) -> a + b);

        System.out.println("The sum of all elements of numbers array " + sum2.get());
    }
}