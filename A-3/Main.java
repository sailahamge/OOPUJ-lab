class Animal
{
	void voice()
	{
		System.out.println("In Animal voice()");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("In bark()");
	}
}
class Cat extends Animal
{
	void meow()
	{
		System.out.println("In meow()");
	}	
}
public class Main
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.bark();
		d.voice();
		Cat c=new Cat();
		c.meow();
		c.voice();
	}
}