package com.softwaretestingo.sto01005_arraysprograms;
public class STO0003_FindDuplicatesInAArray 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find the Duplicate Values From the Array
	 * 
	 */
    public static void main(String[] args)
    {
        int []arr={1,2,2,1,3,3,4};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}