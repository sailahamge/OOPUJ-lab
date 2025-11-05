import java.util.*;
public class Voting
{
public static void main(String args[])
{
Scanner st=new Scanner(System.in);
System.out.println("Enter the age:");
int age=st.nextInt();
if(age<18)
{
System.out.println("You are not eligible for voting");
throw ArithmeticException("Invalid user");
}
else 
{
System.out.println("Valid user");
}
System.out.println("Welcome to voting application candidates list are:");

}
}