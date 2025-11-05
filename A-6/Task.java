public class Task implements Runnable
{
public void run()
{
System.out.println("Thread is running");
}
public static void main(String args[])
{
Task r=new Task();
Thread t=new Thread(r);
t.start();
}
}