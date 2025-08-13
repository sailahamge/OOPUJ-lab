class Student
{
	int fee=91000;
	public void get()
	{
		System.out.println("In Student class");
	}
}
class ItStudent extends Student
{
	int iterafee=200;
	public void display()
	{
		System.out.println("In display of itstudents");
	}
	public static void main(String args[])
	{
		ItStudent i=new ItStudent();
		int totalfee=i.fee+i.iterafee;
		i.get();
		i.display();
		System.out.println("College fee: "+i.fee);
		System.out.println("Itera fee: "+i.iterafee);
		System.out.println("Total fee: "+totalfee);

	}
	
}