class Mythread implements Runnable
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("Thread is running at count "+i);
}
}
}
public class Run
{
public static void main(String args[])
{
Mythread bullet1=new Mythread();
Thread gun1=new Thread(bullet1);
Mythread bullet2=new Mythread();
Thread gun2=new Thread(bullet2);
gun1.start();
gun2.start();

}
}