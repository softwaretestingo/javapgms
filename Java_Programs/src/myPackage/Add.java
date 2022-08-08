package myPackage;
public class Add 
{
		   public int add(int a, int b)
		   {
			return a+b;
		   }
		   public static void main(String args[])
		   {
			   Add obj = new Add();
			   System.out.println(obj.add(10, 20));
		   }
}