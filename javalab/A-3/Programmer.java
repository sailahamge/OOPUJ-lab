class Employee
{
	int salary=100000;
	public void getsalary()
	{
		System.out.println("Salary of employee: "+salary);
	}
}
public class Programmer extends Employee
{
	int bonus;
	public void display()
	{
		System.out.println("In Programmer class");
	}
	public static void main(String args[])
	{
		Programmer p1=new Programmer();
		p1.bonus=5000;
		p1.display();
		p1.getsalary();
		System.out.println("Bonus: "+p1.bonus);
		int total=p1.bonus+p1.salary;
		System.out.println("Total Amount: "+total);
	}
}
