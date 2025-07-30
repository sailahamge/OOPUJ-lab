import java.util.*;
public class Addition2
{
	public static void main(String args[])
	{
		Scanner st=new Scanner(System.in);
		System.out.print("Enter the first no:");
		int a=st.nextInt();
		System.out.print("Enter the second no:");
		int b=st.nextInt();
		System.out.println("Addition:"+(a+b));
		System.out.println("Subtraction:"+(a-b));
		System.out.println("Multiplication:"+(a*b));
		System.out.println("Division:"+(a/b));
	}
}