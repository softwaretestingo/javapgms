package com.softwaretestingo.collectedpgms.array;

public class FindMaxMinDiff {

    public static void main(String[] args){
        int [] arr = {10,90,2,40,1,25,11};
         int max=0;
         int min=arr[0];;

         for(int i=0 ;i<arr.length;i++){
        	 
             if(arr[i]>max){
                 max=arr[i];
             }
             else if(arr[i]<min){

                 min=arr[i];
             }
         }
         System.out.println("The maximum number in an array is " +max);
         System.out.println("The minimum number in an array is " +min);
         System.out.println("The diff between max and min in array is "+(max-min));
    }
}
