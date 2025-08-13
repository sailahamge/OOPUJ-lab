class Employee
{
	int salary=100000;
	public void getsalary()
	{
		System.out.println("Salary of employee: "+salary);
	}
}
class Programmer extends Employee
{
	int bonus;
	public void display()
	{
		System.out.println("In Programmer class");
	}

}
class Software extends Employee
{
	int bonus;
	public void display1()
	{
		System.out.println("In Software class");
	}

}
public class Salary
{
	public static void main(String args[])
	{
		Software s=new Software();
		Programmer p=new Programmer();
		s.bonus=10000;
		p.bonus=20000;
		int ss=s.salary+s.bonus;
		System.out.println("Total Salary of Software: "+ss);
		int ps=p.salary+p.bonus;
		System.out.println("Total Salary of Programmer: "+ps);


	}
}
