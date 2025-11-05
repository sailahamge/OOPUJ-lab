// positive and negative no
import java.util.*;
public class PN
{
	public static void main(String args[])
	{
		Scanner st=new Scanner(System.in);
		System.out.print("Enter the no:");
		int a=st.nextInt();
		if(a>0)
		{
			System.out.println("Positive no");
		}
		else if(a==0)
		{
			System.out.println("zero");
		}
		else
		{
			System.out.println("Negative");
		}
	}
}