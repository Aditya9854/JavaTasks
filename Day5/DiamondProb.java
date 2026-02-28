
interface Info1
{
    default void display()
    {
        System.out.println("Method in Info1");
    }
}
interface Info2
{
    default void display()
    {
        System.out.println("Method in Info2");
    }
}
class Test implements Info1,Info2
{
    public void display()
    {
        Info1.super.display();
        Info2.super.display();
    }
}
public class DiamondProb
{
    public static void main(String[]a)
    {
        Test tObj = new Test();
        tObj.display();
    }
}