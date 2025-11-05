interface GrandSon
{
	public void bringIce();

interface Father extends GrandSon
{
	public void bringWater();
}
interface Mother extends GrandSon
{
	public void bringWater();
}
class Son implements Father,Mother
{
	public void bringWater()
	{
		System.out.println("Brought water from mother and Father");
	}
	public void bringCholate()
	{
		System.out.println("Brought Cholate from son");
	}
	public void bringIce()
	{
		System.out.println("Brought Ice from GrandSon");

	}
}
public class Tester
{
	public static void main(String args[])
	{
		Tester s=new Tester();
		s.bringWater();
		s.bringCholate();
		s.bringIce();

	}
}
