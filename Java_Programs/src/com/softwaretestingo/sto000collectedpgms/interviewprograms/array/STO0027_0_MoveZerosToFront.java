package com.softwaretestingo.sto000collectedpgms.interviewprograms.array;
public class STO0027_0_MoveZerosToFront 
{
	/**
	 * Input:[5, 0, 4, 6, 0, 7, 0]
	 * Output: 0 0 0 5 4 6 7
	 * 
	 */
	public static void main(String[] args) 
	{
        int[] input = {5, 0, 4, 6, 0, 7, 0};
        int[] output = new int[input.length];

        int index = input.length - 1;

        // Place non-zero elements from the end
        for (int i = input.length - 1; i >= 0; i--) 
        {
            if (input[i] != 0)
            {
                output[index--] = input[i];
            }
        }

        // Remaining positions are zeros by default
        for (int num : output)
        {
            System.out.print(num + " ");
        }
	}
}