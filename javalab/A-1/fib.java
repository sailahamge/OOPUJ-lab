import java.util.*;
public class fib
{
	public static void main(String args[])
	{
		Scanner st=new Scanner(System.in);
		System.out.print("Enter the no:");
		int n=st.nextInt();
		int a=0;
		int b=1;
		int c;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=2;i<n;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}