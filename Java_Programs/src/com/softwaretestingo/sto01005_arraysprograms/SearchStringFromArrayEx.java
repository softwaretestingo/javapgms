package com.softwaretestingo.sto01005_arraysprograms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SearchStringFromArrayEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: From a String Array Find a Specific String and Also Find the String Position
	 * @param args
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		int size;
		boolean value=false;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("What Should be the Size of the Array: ");
		size=Integer.parseInt(br.readLine());
		
		String arr[]=new String[size];
		System.out.println("Enter " + size + " Strings: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=br.readLine();
		}
		
		System.out.println("Enter the String Which you want to Search");
		String searchStr=br.readLine();
		
		for (int i=0;i<size;i++) 
		{
			if(arr[i].equalsIgnoreCase(searchStr))
			{
				System.out.println("Element Found in "+(i+1)+" position");
				value=true;
			}
		}
		if(value)
		{
			System.out.println("We Have Found the string "+ searchStr);
		}
		else
		{
			System.out.println("Searched String is not in the sentence");
		}
	}
}