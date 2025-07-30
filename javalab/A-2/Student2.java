public class Student2
{
	int emid;
	String Name;
	int salary;
	public Student2(int id,String name,int sal)
	{
		emid=id;
		Name=name;
		salary=sal;
		System.out.println("ID "+emid+" name "+Name+" salary "+salary);
	}
	public Student2(Student2 obj)
	{
		emid=obj.emid;
		Name=obj.Name;
		salary=obj.salary;
		System.out.println("ID "+emid+" name "+Name+" salary "+salary);

	}
	public static void main(String args[])
	{
		Student2 e=new Student2(101,"Sai",15500);
		Student2 e1=new Student2(e);
	}
}