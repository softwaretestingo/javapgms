package myPackage;

import java.util.Scanner;

public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startNo, endNo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Start Number");
		startNo = sc.nextInt();
		System.out.println("Enter The End Number");
		endNo = sc.nextInt();

		for (int i = startNo; i <= endNo; i++) {
			int count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++; // Increment if 'i' is divisible by 'j'
					break;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}

		}

	}

}
