interface Father 
{
public void bringwater();
}
interface Mother
{
public void bringwater();
}
class Son implements Father,Mother
{
public void bringwater()
{
System.out.println("Brought water for Mother and Father");
}
public void givewater()
{
System.out.println("Give the water");
}
}
public class Friend extends Son
{
public static void main(String []args)
{
Friend f=new Friend();
f.bringwater();
f.givewater();
}
}
