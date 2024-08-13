package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Arrays;
public class STO0042_0_InterviewPrograms 
{
	/*
	 * Input =“abCdefGHijkl”; 
	 * Output: “ab Cdef G Hijkl”
	 */
	public static void main(String[] args) 
	{
		String st = "abCdefGHijkl";
		String[] r = st.split("(?=\\p{Upper})");
		Arrays.stream(r).forEach(System.out::println);
	}
}