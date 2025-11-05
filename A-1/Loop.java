//using for loop
import java.util.*;
public class Loop
{
	public static void main(String args[])
	{
		Scanner st=new Scanner(System.in); 
		System.out.print("Enter the size of array:");
		int n=st.nextInt();
		int[] a=new int[n];
		int sum=0;
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=st.nextInt();
	 		sum += a[i];
		}
		System.out.println("Addition of given elements is : "+sum);
		
	}
}
