package com.softwaretestingo.collectedpgms.numbers;
public class PrimeOrNot 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Print All the Prime Numbers Between 1 to 500 
	 * 
	 */
    public void primeuptoGivenValue()
    {
        int n=500;
        for(int i=2;i<=n;i++)
        {
            boolean isPrime=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println(i);
            }
        }
    }

    public void findPrimeorNot()
    {
        int num=7;
        int count=0;
        if(num>1)
        {
            for (int i=1;i<=num;i++)
            {
                if(num%i==0)
                    count++;

            }
            if(count==2)
            {
                System.out.println("Prime number");
            }
            else
            {
                System.out.println("not a prime");
            }
        }
    }

    public static void main(String[] args)
    {
        PrimeOrNot primeOrNot=new PrimeOrNot();
        primeOrNot.primeuptoGivenValue();
        //primeOrNot.findPrimeorNot();
    }
}