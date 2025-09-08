class Parent
{
	void display()
	{
		System.out.println("4 parametes");
	}

}
public class Child extends Parent
{
	void display()
	{
		System.out.println("5 parametes");
	}
	public static void main(String args[])
	{
		Child c=new Child();
		c.display();
	}


}