class Student15
{
	int rollno=15;
	String name="Sai Lahamge";
	int marks=50;
	public Student15()
	{
		System.out.println("Roll No:"+rollno+" Name:"+name+" Marks:"+marks);
	}
	public Student15(int r)
	{
		rollno=r;
		System.out.println("Roll No:"+rollno);
	}
	public Student15(String n)
	{
		name=n;
		System.out.println("Name:"+name);
	}
	public Student15(int r,String n)
	{
		rollno=r;
		name=n;
		System.out.println("Roll No:"+rollno+" Name:"+name);
	}
	public Student15(int r,String n,int m)
	{
		rollno=r;
		name=n;
		marks=m;
		System.out.println("Roll No:"+rollno+" Name:"+name+" Marks"+marks);
	}
	public static void main(String args[])
	{
		Student15 s1=new Student15();
		Student15 s2=new Student15(3);
		Student15 s3=new Student15("Sudarshan");
		Student15 s4=new Student15(6,"Parth");
		Student15 s5=new Student15(60,"Ashish",100);

	}


	
}