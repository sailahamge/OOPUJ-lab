import java.util.*;
class Student
{
	String name;
	int rollno;
	void data()
	{
		Scanner st=new Scanner(System.in);
		System.out.print("Enter the name: ");
		name=st.nextLine();
		System.out.print("Enter the roll no: ");
		rollno=st.nextInt();

	}
	void d()
	{
		System.out.println("Students details");
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+rollno);
	}
}
class Sem1 extends Student
{
	int chem;
	int m1;
	int bxe;
	void input1()
	{
		Scanner st=new Scanner(System.in);
		System.out.print("Enter the marks of chemistry: ");
		chem=st.nextInt();
		System.out.print("Enter the marks of m1: ");
		m1=st.nextInt();
		System.out.print("Enter the marks of bxe: ");
		bxe=st.nextInt();
	}
	void Total1()
	{
		int t=chem+m1+bxe;
		System.out.println("Total Marks in sem1: "+t);
	}
	void avg1()
	{
		float a=(chem+m1+bxe)/3;
		System.out.println("Avg Marks in sem1: "+a);
	}
}
public class Sem2 extends Sem1
{
	int m2;
	int phy;
	int python;
	void input2()
	{
		Scanner st=new Scanner(System.in);
		System.out.print("Enter the marks of m2: ");
		m2=st.nextInt();
		System.out.print("Enter the marks of phy: ");
		phy=st.nextInt();
		System.out.print("Enter the marks of python: ");
		python=st.nextInt();
	}

	void Total2()
	{
		int t=m2+phy+python;
		System.out.println("Total Marks in sem2: "+t);
	}
	void avg2()
	{
		float avg=(m2+phy+python)/3;
		System.out.println("Average Marks in sem2: "+avg);

	}
	public static void main(String args[])
	{
		Sem2 s=new Sem2();
		System.out.println("Enter the details of student");
		s.data();
		s.d();
		System.out.println("Enter the marks of sem1:");
		s.input1();
		System.out.println("Enter the marks of sem2:");
		s.input2();
		s.Total1();
		s.Total2();
		s.avg1();
		s.avg2();


	}
}