interface Animal
{
	void eat();
}
interface Pet
{
	void play();
}
class Dog implements Animal,Pet
{
	public void eat()
	{
		System.out.println("The Dog eats..");
	}
	public void play()
	{
		System.out.println("The Dog plays..");

	}
}
public class Multi
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.eat();
		d.play();
	}
}