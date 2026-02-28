
class DefAccess
{
    //Default Access
    //can be accessible within same package+ subclass
    int iNo = 10;

    void display()         
    {
        System.out.println("Method with Default modifier");
    }
}

public class AccessMod2 
{
    public static void main(String[]a)
    {
        DefAccess obj = new DefAccess();

        System.out.println(obj.iNo);
        obj.display();
    }
    
}
