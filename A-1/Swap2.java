public class Swap2
{
	public static void main(String args[])
	{
		int a=10;
		int b=5;
		System.out.println("Before swaping");	
		System.out.println("a and b value "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swaping");	
		System.out.println("a and b value "+a+" "+b);

	
	}
}