class Myrun implements Runnable
{
public void run()
{
System.out.println("Thread is running...");
}
}
public class Main1
{
public static void main(String args[])
{
Myrun run=new Myrun();
Thread t1=new Thread(run);
t1.start();
}
}