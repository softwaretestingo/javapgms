package myPackage;
//This class has default access modifer as no modifer is mentioned
public class DisplayEx 
{
	public void display()
	{
		System.out.println("Display Method Called of MyPackage Package");
	}
	static public void main(String args[])
	{
		DisplayEx obj=new DisplayEx();
		obj.display();
	}
}