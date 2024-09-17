package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class STO0083_1_FindKthSmallestElementFromArray 
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

		// since counting starts from 0 so to find kth
		// element we need to reduce K by 1
		K--;

		// for storing elements in sorted form
		// in set we will use TreeSet
		Set<Integer> s = new TreeSet<Integer>();

		// Adding elements to set
		for (int i = 0; i < N; i++)
			s.add(arr[i]);

		// Use iterator method of Iterator
		// for the traversal
		Iterator<Integer> itr = s.iterator();

		while (K > 0)
		{
			itr.next();
			K--;
		} // itr points to the Kth element in the set

		System.out.println("The "+position+" Smallest Element is "+itr.next());
	}

}