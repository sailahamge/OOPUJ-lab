import java.util.*;
public class Operator
{
	public static void main(String args[])
	{
		Scanner st=new Scanner(System.in);
		System.out.print("Enter the 1st no:");
		int a=st.nextInt();
		System.out.print("Enter the 2nd no:");
		int b=st.nextInt();
		int val=(a>b)?a:b;
		System.out.println("Greater no is:"+val);
	}
}