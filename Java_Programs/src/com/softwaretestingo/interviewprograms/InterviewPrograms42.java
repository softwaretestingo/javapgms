package com.softwaretestingo.interviewprograms;
import java.util.Arrays;
public class InterviewPrograms42 
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