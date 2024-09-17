package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
public class STO0083_3_FindKthSmallestElementFromArray 
{
	public static int  kthSmallestElement(int  k, int[] array)
	{
		PriorityQueue<Integer> maxHeap = new  PriorityQueue<>(Collections.reverseOrder());
		int  length = array.length;
		for  (int  i = 0; i < length; i++)
		{
			maxHeap.add(array[i]);
			if  (maxHeap.size() > k)
			{
				maxHeap.poll();
			}
		}
		return  maxHeap.peek();
	}

	public static void main(String[] args) 
	{
		int [] array = {1, 3, 8, 9, 4, 7, 6};
		System.out.println("Input: "+Arrays.toString(array));
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of k : ");
		int k = sc.nextInt();
		
		
		System.out .println("The "+k+" Smallest Element is "+kthSmallestElement(k, array));
	}

}