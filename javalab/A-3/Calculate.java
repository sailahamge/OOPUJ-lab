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
public class Sem2 extends Student
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
}
public class Calculate
{
	public static void main(String args[])
	{
		Sem2 s2=new Sem2();
		Sem1 s1=new Sem1(); 
		System.out.println("Enter the details of student1");
		s1.data();
		s1.d();
		System.out.println("Enter the details of student2");
		s2.data();
		s2.d();
		System.out.println("Enter the marks of sem1:");
		s1.input1();
		System.out.println("Enter the marks of sem2:");
		s2.input2();
		s1.Total1();
		s2.Total2();
		s1.avg1();
		s2.avg2();


	}

}