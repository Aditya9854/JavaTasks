//1.calling base class Attribute Using super() 

class Base1 
{
    protected String uni = "SPPU";
}
class Derived1 extends Base1 
{
    public String dept = "IT";

    void printInfo()
    {
        //Accessing base class attribute using super
        System.out.println("University : "+super.uni);
        System.out.println("Department : "+dept);
    }
}
public class Super2 
{
    public static void main(String []a)
    {
        Derived1 dObj = new Derived1();

        dObj.printInfo();
    }
     
}
