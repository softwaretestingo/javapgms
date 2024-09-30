package com.softwaretestingo.sto000collectedpgms.interviewprograms.array;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
public class STO0082_0_FindKthLargestElementFromArray 
{
	// Function to find the k'th largest element in an array using min-heap
    public static int findKthLargest(List<Integer> ints, int k)
    {
        // base case
        if (ints == null || ints.size() < k) {
            System.exit(-1);
        }
 
        // create a min-heap using the `PriorityQueue` class and insert
        // the first `k` array elements into the heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(ints.subList(0, k));
 
        // do for remaining array elements
        for (int i = k; i < ints.size(); i++)
        {
            // if the current element is more than the root of the heap
            if (ints.get(i) > pq.peek())
            {
                // replace root with the current element
                pq.poll();
                pq.add(ints.get(i));
            }
        }
 
        // return the root of min-heap
        return pq.peek();
    }

	public static void main(String[] args) 
	{
		List<Integer> ints = Arrays.asList(17, 24, 6, 3, 39, 1);
		System.out.println("Input: "+ints);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of k : ");
		int k = sc.nextInt();
 
        System.out.println(k+" largest array element From Array is " + findKthLargest(ints, k));
	}

}