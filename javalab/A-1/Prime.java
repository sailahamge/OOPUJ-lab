import java.util.*;
public class Prime
{
	public static void main(String args[])
	{	
		Scanner st=new Scanner(System.in);
		int n=st.nextInt();
		int found=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("Not prime no");
				found=1;
				break;
			}
		}
		if(found==0)
		{
			System.out.println("Prime no");	
		}
		
	}
}