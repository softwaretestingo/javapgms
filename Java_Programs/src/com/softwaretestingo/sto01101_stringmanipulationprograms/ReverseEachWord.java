package com.softwaretestingo.sto01101_stringmanipulationprograms;
public class ReverseEachWord 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Reverse each Word of the String With Reserve the Space
	 * 
	 */
	public static void main(String[] args) 
	{
		String sentence = "Welcome To Software Testingo Blog";
        String reversedSentence = reverseEachWord(sentence);
        System.out.println("Original String: "+sentence);
        System.out.println("Reverse String: "+reversedSentence);
	}
	public static String reverseEachWord(String sentence) 
	{
        // Split the sentence into individual words
        String[] words = sentence.split(" ");
        
        // Reverse each word
        for (int i = 0; i < words.length; i++) 
        {
            words[i] = reverseWord(words[i]);
        }
        
        // Join the reversed words back together with spaces between them
        return String.join(" ", words);
    }
    
    public static String reverseWord(String word) 
    {
        // Convert the word to a char array for easy manipulation
        char[] charArray = word.toCharArray();
        
        // Reverse the characters in the char array
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) 
        {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        
        // Convert the char array back to a String
        return new String(charArray);
    }
}