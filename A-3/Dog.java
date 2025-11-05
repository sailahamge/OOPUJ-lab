class Animal
{
	void display()
	{
		System.out.println("display() voice is ");
	}

}
public class Dog extends Animal
{
	void bark()
	{
		System.out.println("bark() voice is barking");

	}
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.display();
		d.bark();
		Animal a=new Animal();
		a.display();
		Animal a1=new Dog();
		a1.display();
	}
}