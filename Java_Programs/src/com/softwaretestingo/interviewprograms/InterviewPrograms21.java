package com.softwaretestingo.interviewprograms;
public class InterviewPrograms21 
{
	/*
	 * Input int a[]={5,0,4,6,0,7,0} 
	 * Output = {0,0,0,5,4,6,7} 
	 * Goal is to print all zero first and then the rest of other numbers as it is.
	 */
	public static void main(String[] args) 
	{
		int[] array = {5,0,4,6,0,7,0};
		int current = array.length - 1;
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] != 0) {
				array[current] = array[i];
				current--;
			}
		}
		while (current >= 0) {
			array[current] = 0;
			current--;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}