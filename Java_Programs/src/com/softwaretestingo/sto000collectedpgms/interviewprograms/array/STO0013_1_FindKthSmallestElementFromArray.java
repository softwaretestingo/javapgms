package com.softwaretestingo.sto000collectedpgms.interviewprograms.array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class STO0013_1_FindKthSmallestElementFromArray 
{
	public static void main(String[] args) 
	{
		int[] arr = { 12, 3, 5, 7, 19 };
		System.out.println("Input: "+Arrays.toString(arr));
		int N = arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of k : ");
		int K = sc.nextInt();
		int position=K;

		K--;

		Set<Integer> s = new TreeSet<Integer>();

		for (int i = 0; i < N; i++)
			s.add(arr[i]);

		Iterator<Integer> itr = s.iterator();

		while (K > 0)
		{
			itr.next();
			K--;
		}

		System.out.println("The "+position+" Smallest Element is "+itr.next());
	}

}