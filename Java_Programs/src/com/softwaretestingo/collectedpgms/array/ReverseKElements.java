package com.softwaretestingo.collectedpgms.array;

public class ReverseKElements {

	public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 9, 4};
        int k = 3;
        int start=0;;
        int end=arr.length-1;
        for(int j=0;j<k;j++)
        {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        }
	}

}
