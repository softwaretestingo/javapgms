package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0089_2_InterviewPrograms 
{
	//Find the Peak Element Index Of the Mountain Array
	public static int getPeakIndex(int[] array) 
	{
		int low = 0;
		int high = array.length - 1;
		int mid;
		while (low<high) 
		{
			mid = low + (high - low) / 2;
			if (array[mid] >= array[mid + 1]) 
			{
				high = mid;
			} 
			else {
				low = mid + 1;
			}
		}
		return low;
	}

	public static void main(String[] args)
	{
		int mountainArray[] = { 4, 8, 16, 32, 27, 9, 3 };
		int peak = getPeakIndex(mountainArray);
		System.out.println("Peak index is:" + peak);
	}
}