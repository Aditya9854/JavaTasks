class Base
{
    int iNo = 24;

}
class Derived extends Base
{
    int iNo = 120;

    void display()
    {
        System.out.println("Value of iNo : "+super.iNo);//Accessing parent class variable using super
    }
}
public class SuperKeyword {
    public static void main(String[]a)
    {
        Derived dObj = new Derived();

        dObj.display();
    }
}
