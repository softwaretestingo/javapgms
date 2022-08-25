package com.softwaretestingo.ProgramsOnNumbers;
import java.util.Arrays;
public class SmallestPositiveIntegerNotInArray 
{
	public static int solution(int[] inputArray)
	{
		int smallestInt = 1;
		if (inputArray.length == 0)
			return smallestInt;
		Arrays.sort(inputArray);
		if (inputArray[0] > 1)
			return smallestInt;
		if (inputArray[inputArray.length - 1] <= 0)
			return smallestInt;
		for (int i = 0; i < inputArray.length; i++) 
		{
			if (inputArray[i] == smallestInt) 
			{
				smallestInt++;
			}
		}
		return smallestInt;
	}
	public static void main(String[] args) 
	{
		int[] inputArray = { 10, 2, 25, 43, 0, 67, 1, 7 }; // Output: 3
		int[] inputArray1 = { 1, 3, 6, 4, 1, 2 }; // Output: 5
		int[] inputArray2 = { 1, 2, 3 }; // Output: 4
		int[] inputArray3 = { -1, -3 }; // Output: 1
		System.out.println(solution(inputArray));
		System.out.println(solution(inputArray1));
		System.out.println(solution(inputArray2));
		System.out.println(solution(inputArray3));
	}
}