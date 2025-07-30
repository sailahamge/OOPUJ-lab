//write the program to find factorial of given no.
import java.util.Scanner;
public class Fac
{
	public static void main(String args[])
	{
		Scanner st=new Scanner(System.in);	
		System.out.print("Enetr the no:");
		int data=st.nextInt();
		int fac=1;
		for(int i=1;i<=data;i++)
		{
			fac=fac*i;
		}
		System.out.println("Factorial:"+fac);
	}
}
