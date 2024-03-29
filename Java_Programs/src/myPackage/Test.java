package myPackage;
public class Test {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			for(int j=10;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		
		
	}
}