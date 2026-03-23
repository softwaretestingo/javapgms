package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
// Print duplicate character in a string //
public class STO0001_1_MaxCharacterCountInString 
{
	/**
	 * Input: softwaretestingo
	 * Output: 
	 * s-2
	 * o-2
	 * t-3
	 * e-2
	 * 
	 */
	public static void main(String[] args) 
	{
		String input = "softwaretestingo";  
		int count;  

		System.out.println("Input: "+input);
		//Converts given string into character array  
		char string[]=input.toCharArray();  

		System.out.println("Output: ");
		//Counts each character present in the string  
		for(int i = 0; i <string.length; i++) 
		{  
			count = 1;  
			for(int j = i+1; j <string.length; j++) 
			{  
				if(string[i] == string[j] && string[i] != ' ') 
				{  
					count++;  
					//Set string[j] to 0 to avoid printing visited character  
					string[j] = '0';  
				}  
			}  
			//A character is considered as duplicate if count is greater than 1  
			if(count > 1 && string[i] != '0')  
				System.out.println(string[i] + "-"+ count);  
		}  
	}
}