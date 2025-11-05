class Task extends Thread
{
public void run()
{
for(int i=0;i<3;i++)
{
System.out.println("Thread "+i" Ruuning");
}
}
}
public class Main5
{
public static void main(String args[])
{
Task t1=new Task();
Task t2=new Task();
Task t3=new Task();
t1.start();
t2.start();
}
}
