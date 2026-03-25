package com.softwaretestingo.sto000collectedpgms.patternprograms;
public class STO0001_4_DiamondStarPattern 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Print The Following Pattern
	 * 			*
	 * 			**
	 * 			***
	 * 			****
	 * 			****
	 * 			***
	 * 			**
	 * 			*
	 * 
	 */
    //Star Triangle Pattern
     public static void main(String[] args)
     {
     STO0001_4_DiamondStarPattern sTO0001_4_DiamondStarPattern=new STO0001_4_DiamondStarPattern();
     sTO0001_4_DiamondStarPattern.starPattern();
     sTO0001_4_DiamondStarPattern.invertedStarPattern();
     }

     public void starPattern()
     {
        for (int i=1;i<=4;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void invertedStarPattern()
    {
         for (int i=1;i<=4;i++)
         {
             for (int j=4;j>=i;j--)
             {
                 System.out.print("*");
             }
             System.out.println();
         }
    }
}