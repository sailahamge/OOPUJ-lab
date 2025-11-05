abstract class Cricket
{
	public abstract void body();
	public void fitness()
	{
		System.out.println("In fitness methoad");
	}
}
public class Player extends Cricket
{
	public void body()
	{
		System.out.println("In Body methoad");
	}
	public static void main(String args[])
	{
		Player p=new Player();
		p.fitness();
		p.body();
	}
}