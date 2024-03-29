package com.softwaretestingo.stringmanipulationpgms;

import java.util.Arrays;

public class StringCountCharacterOccuranceWithoutUsingMAP {

	public static void main(String[] args) 
	{
		/*
		 * String str="welcome to softwaretestingo blog"; char arr[]=str.toCharArray();
		 * int size=arr.length; for(int i=0;i<size;i++) { int count=1; for(int
		 * j=i+1;j<size;j++) { if(arr[i]==arr[j]) { count++; } } if(Arrays.)
		 * System.out.println(arr[i]+ " "+count); }
		 */
		
		String str = "hello world";
        int[] charCounts = new int[256]; // Assuming ASCII characters

        // Count occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCounts[ch]++;
        }

        // Print characters and their occurrences
        System.out.println("Character occurrences:");
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 0) {
                System.out.println((char) i + ": " + charCounts[i]);
            }
        }
	}

}
