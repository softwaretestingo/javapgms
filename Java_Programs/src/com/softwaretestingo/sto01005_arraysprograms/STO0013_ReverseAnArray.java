package com.softwaretestingo.sto01005_arraysprograms;
public class STO0013_ReverseAnArray 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Print the Array In Reverse Order
	 * @param args
	 */
    public static void main(String [] args)
    {
        int arr[]={1,2,3,4,5,6};

        System.out.println("Array in reverse order");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}