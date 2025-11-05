public class Task1 implements Runnable
{
public void run()
{
for(int i=0;i<3;i++)
System.out.println("Thread is "+i+" running");
}
public static void main(String args[])
{
Task1 r=new Task1();
Thread t1=new Thread(r);
Thread t2=new Thread(r);
Thread t3=new Thread(r);
t1.start();
t2.start();
t3.start();
}
}