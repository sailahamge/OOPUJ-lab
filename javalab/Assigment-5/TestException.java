public class TestException
{
	public static void main(String args[])
	{
		int a=10;
		int b=0;
		try
		{
			int c=a/b;
			System.out.println("Division: "+c);
		}
		catch(Exception e)
		{
			System.out.println("Cannot divide any no by zero:"+e);
		}
		int d=a+b;
		System.out.println("Addition: "+d);
		int l=a*d;
		int f=a-l;
		System.out.println("Multiplication: "+f);
		System.out.println("subtraction: "+l);


	}
}