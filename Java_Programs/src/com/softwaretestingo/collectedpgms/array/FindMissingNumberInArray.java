package com.softwaretestingo.collectedpgms.array;

public class FindMissingNumberInArray {

    public static void main(String[] args){

        int a[]={1,2,3,4,6};

        int size=a.length;
        int sum=(size+1)*(size+2)/2;
       for(int i=0;i<size;i++){
            sum=sum-a[i];
        }
        System.out.println("Sum of elements in array is "+sum);

        
    }
}
