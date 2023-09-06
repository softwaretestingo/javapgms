package com.softwaretestingo.interviewprograms;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
public class InterviewPrograms82_1 
{
	// Function to find the k'th largest element in an array using max-heap
	public static int findKthLargest(List<Integer> ints, int k)
	{
		// base case
		if (ints == null || ints.size() < k) 
		{
			System.exit(-1);
		}

		// build a max-heap using the `PriorityQueue` class from all
		// elements in the list
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
		// or pass `Comparator.reverseOrder()`
		pq.addAll(ints);

		// pop from max-heap exactly `k-1` times
		while (--k > 0) 
		{
			pq.poll();
		}

		// return the root of max-heap
		return pq.peek();
	}

	public static void main(String[] args) 
	{
		List<Integer> ints = Arrays.asList(7, 4, 6, 3, 9, 1);
		int k = 2;

		System.out.println("k'th largest array element is " + findKthLargest(ints, k));
	}

}