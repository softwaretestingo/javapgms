package com.softwaretestingo.sto01005_arraysprograms;
public class STO0004_FindMaxMinDiff
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find the Max and Min Value Of The Array and Also Find the Difference Between Max & Min
	 * 
	 */
    public static void main(String[] args)
    {
        int [] arr = {10,90,2,40,1,25,11};
         int max=0;
         int min=arr[0];;

         for(int i=0 ;i<arr.length;i++)
         {	 
             if(arr[i]>max)
             {
                 max=arr[i];
             }
             else if(arr[i]<min)
             {

                 min=arr[i];
             }
         }
         System.out.println("The maximum number in an array is " +max);
         System.out.println("The minimum number in an array is " +min);
         System.out.println("The diff between max and min in array is "+(max-min));
    }
}