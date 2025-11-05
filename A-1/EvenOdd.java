//even odd no
import java.util.Scanner;
public class EvenOdd
{	
	public static void main(String args[])
	{
		Scanner st=new Scanner(System.in);
		System.out.print("Enter the no:");
		int n=st.nextInt();
		if(n%2==0)
		{
			System.out.println("Even no");
		}
		else
		{
			System.out.println("Odd no");
		}
		
	}
}