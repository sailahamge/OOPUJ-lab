public class Polymorphism1
{
public int add(int a,int b,int c)
{
return a+b+c;
}
public float add(float a,float b,float c)
{
return a+b+c;
}
public double add(double a,double b,double c)
{
return a+b+c;
}
public static void main(String args[]) {
    Polymorphism1 a = new Polymorphism1();
    System.out.println("Int add: " + a.add(5, 3, 4));
    System.out.println("Float add: " + a.add(3.14f, 4.32f, 5.32f));
    System.out.println("Double add: " + a.add(2.33, 4.13, 6.34));
}
}