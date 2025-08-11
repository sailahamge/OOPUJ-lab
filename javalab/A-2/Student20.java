import java.util.*;

public class Student20
{
	int rollno;
	String name;
	public void Student20()
	{
		rollno=15;
		name="Sai";
		System.out.println("Roll no:"+rollno);
		System.out.println("name:"+name);
	}
	public void Student20(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
		System.out.println("Roll no:"+rollno);
		System.out.println("name:"+name);

	}
	public static void main(String args[])
	{
		Student20 s=new Student20();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roll No. :");
		int r = sc.nextInt();
		System.out.print("Enter Name :");
		String n = sc.next();
		Student1 s1=new Student1(r,n);
	}
}