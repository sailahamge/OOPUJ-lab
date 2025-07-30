import java.util.*;
public class Table
{
	public static void main(String args[])
	{
		Scanner st=new Scanner(System.in);
		System.out.print("Enter the table:");
		int n=st.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
	}
}