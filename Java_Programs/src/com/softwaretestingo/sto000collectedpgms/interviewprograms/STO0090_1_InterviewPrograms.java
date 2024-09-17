package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class STO0090_1_InterviewPrograms 
{
	//Java Program to Display  repeated/Duplicate words in String
	public static void main(String[] args) 
	{
		System.out.print("Enter string to analyse:");
		Scanner sn = new Scanner(System.in);
		String input = sn.nextLine();
		System.out.println("Input: "+input);

		// first let us split string into words
		String[] words = input.split(" ");

		// adds all words into a map
		// we also check whether the word is already in map!
		Map<String,String> wordMap = new HashMap<String,String>();                
		Map<String,String> printedMap = new HashMap<String,String>();

		for(int i=0;i<words.length;i++) 
		{
			String word = words[i].toUpperCase(); // for case insensitive comparison
			if(wordMap.get(word)!=null) 
			{
				// we found a duplicated word!
				if(printedMap.get(word)==null) { // first check if it is printed already!
					System.out.println("Duplicated/Repeated word:"+word);
					printedMap.put(word, word); 
				}
			}else 
			{
				wordMap.put(word, word);
			}
		}
	}
}