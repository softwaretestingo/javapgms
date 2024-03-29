package com.softwaretestingo.collectedpgms.array;

import java.util.Arrays;

public class MoveNegativeToStart {

    public static void main(String[] args){
        int [] arr = {-1,2,3,-4,-7,8};
        int[] tempArr = new int[arr.length];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                //System.out.print(arr[i]);
                tempArr[counter] = arr[i];
                counter++;
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]>0)
            {
                tempArr[counter] = arr[i];
                counter++;
            }
        }

        System.out.print(Arrays.toString(tempArr));
        System.out.println();
        System.out.println("Another Solution");
  
		for(int i=0;i<arr.length;i++)
		{
			int temp=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
    }
}


