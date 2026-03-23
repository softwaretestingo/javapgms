package com.softwaretestingo.sto000collectedpgms.interviewprograms.array;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
public class STO0012_0_FindKthLargestElementFromArray 
{
	/**
	 * Input: [17, 24, 6, 3, 39, 1]
	 * Enter the value of k : 2
	 * 2 largest array element From Array is 24
	 */
    public static int findKthLargest(List<Integer> ints, int k)
    {
        if (ints == null || ints.size() < k) 
        {
            System.exit(-1);
        }
 
        PriorityQueue<Integer> pq = new PriorityQueue<>(ints.subList(0, k));
 
        for (int i = k; i < ints.size(); i++)
        {
            if (ints.get(i) > pq.peek())
            {
                pq.poll();
                pq.add(ints.get(i));
            }
        }
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