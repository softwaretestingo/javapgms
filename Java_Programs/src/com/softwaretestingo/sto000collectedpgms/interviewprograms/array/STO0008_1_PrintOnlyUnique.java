package com.softwaretestingo.sto000collectedpgms.interviewprograms.array;
public class STO0008_1_PrintOnlyUnique
{
	/**
	 * List a[ ] = [2,1,1,4,5,5,6,7] 
	 * Expected output : [2,4,6,7] 
	 * Numbers which gets repeated we should remove and make output as above I know using HashSet
	 * we get as [2, 1,4,5,6,7] But interviewee asked about deleting repeated ones
	 */
	public static void main(String[] args) 
	{
		int arr[] = {2, 1, 1, 4, 5, 5, 6, 7};
        System.out.print("Unique Elements = ");

        for (int i = 0; i < arr.length; i++) 
        {
            boolean isDuplicate = false;
            for (int j = 0; j < arr.length; j++)
            {
                if (i != j && arr[i] == arr[j])
                {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate)
            {
                System.out.print(arr[i] + " ");
            }
        }
	}
}