package com.softwaretestingo.sto000collectedpgms.interviewprograms.array;
public class STO0028_0_SwapAdjacentElements 
{
	/**
	 * Input: [1, 2, 3, 4, 5]
	 * Output: 21435
	 * 
	 */
	public static void main(String[] args) 
	{
		int[] input = {1, 2, 3, 4, 5};

        for (int i = 0; i < input.length; i += 2) 
        {
            if (i + 1 < input.length)
            {
                System.out.print(input[i + 1]);
                System.out.print(input[i]);
            } 
            else 
            {
                System.out.print(input[i]);
            }
        }
	}
}