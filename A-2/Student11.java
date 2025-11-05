class Student11
{
	int rollno;
	String name;
	public Student11(int rollno,String name)
	{
		rollno=rollno;
		name=name;
		System.out.println("Name:"+name+" Roll no:"+rollno);

	}
	public void display()
	{
		System.out.println("Name:"+name+" Roll no:"+rollno);
	}
	public static void main(String args[])
	{
		Student11 s=new Student11(15,"Sai Lahamge");
		s.display();
		

	}
	
}