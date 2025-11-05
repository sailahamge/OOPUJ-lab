class Mythread extends Thread
{
public void run()
{
int i=0;
while(i<40000)
{
System.out.println("Sai is cooking");
System.out.println("he is good boy");
i++;
}
}
}
class Mythread1 extends Thread
{
public void run()
{
int i=0;
while(i<40000)
{
System.out.println("Sai is chating with her");
System.out.println("he is bad boy");
i++;
}
}
}
public class Main2
{
	public static void main(String args[])
	{
		Mythread t1=new Mythread();
		Mythread1 t2=new Mythread1();
		t1.start();
		t2.start();

		
	}
}

