class Mythread extends Thread
{
public void run()
{
for(int i=0;i<4;i++)
{
System.out.println("Thread is running count "+i);
}
}
}
public class Count
{
public static void main(String args[])
{
Mythread t=new Mythread();
Mythread t1=new Mythread();
t.start();
t1.start();
}
}