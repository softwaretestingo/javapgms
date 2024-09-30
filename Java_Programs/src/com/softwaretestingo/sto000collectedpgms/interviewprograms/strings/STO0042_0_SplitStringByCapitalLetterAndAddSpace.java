package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.util.Arrays;
public class STO0042_0_SplitStringByCapitalLetterAndAddSpace 
{
	/*
	 * Input =“abCdefGHijkl”; 
	 * Output: “ab Cdef G Hijkl”
	 */
	public static void main(String[] args) 
	{
		String st = "abCdefGHijkl";
		System.out.println("Input: "+st);
		String[] r = st.split("(?=\\p{Upper})");
		System.out.print("Output: ");
		Arrays.stream(r).forEach(System.out::println);
	}
}