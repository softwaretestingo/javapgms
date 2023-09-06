package com.softwaretestingo.interviewprograms;
import java.util.Scanner;
public class InterviewPrograms88 
{
	public static void main(String[] args)
	{
		int row, i, j, space, num;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter value for rows: ");
		row = in.nextInt();

		for(i=0; i<row; i++)
		{
			for(space=row; space>i; space--)
			{
				System.out.print(" ");
			}
			num=1;
			for(j=0; j<=i; j++)
			{
				System.out.print(num+ " ");
				num = num*(i-j)/(j+1);
			}
			System.out.print("\n");
		}
	}
}