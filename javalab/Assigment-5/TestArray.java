public class TestArray
{
public static void main(String args[])
{
int a[]={2,4,6,8,10};
try
{
System.out.println(a[5]);
}
catch(Exception e)
{
System.out.println("array is of length 5 you are trying the acces 6th element: "+e);
}
System.out.println(a[2]);
}
}
