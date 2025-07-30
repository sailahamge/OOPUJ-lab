//using recursion
import java.util.*;
public class Fact
{
	public static void facto(int n,int fac)
	{
		if(n==0)
		{
			System.out.println("Factorial:"+fac);
			return;
		}
		fac=fac*n;
		facto(n-1,fac);
	}
	public static void main(String args[])
	{
		Scanner st=new Scanner(System.in);
		int fac=1;
		System.out.print("Enter the no:");
		int n=st.nextInt();
		facto(n,fac);
	}
}