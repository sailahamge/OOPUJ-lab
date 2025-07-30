import java.util.*;
public class Got
{
	public static void main(String args[])
	{	
		Scanner st=new Scanner(System.in);
		System.out.print("Enter the 1st no:");
		int a=st.nextInt();
		System.out.print("Enter the 2nd no:");
		int b=st.nextInt();
		System.out.print("Enter the 3rd no:");
		int c=st.nextInt();
		if(a>b && a>c)
		{
			System.out.print("1st no is greater:"+a);
		}
		else if(b>c)
		{
			System.out.print("2nd no is greater:"+b);
	
		}
		else
		{
		
			System.out.print("3rd no is greater:"+c);
		}


	}
}