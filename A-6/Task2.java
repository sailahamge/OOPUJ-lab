public class Task2 implements Runnable
{
public void run()
{
for(int i=0;i<3;i++)
System.out.println("Thread is "+Thread.currentThread().getName()+" running");
}
public static void main(String args[])
{
Task2 r=new Task2();
Thread t1=new Thread(r,"IT");
Thread t2=new Thread(r,"CS");
Thread t3=new Thread(r,"EC");
t1.start();
t2.start();
t3.start();
}
}