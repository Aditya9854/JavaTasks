//Upcasting and Downcasting 
class Payment
{
    int amount = 100;

    void process()
    {
        System.out.println("Processing payment of "+amount);
    }
}
class Gpay extends Payment
{
    String email = "user@example.com";
 
    void process()
    {
        System.out.println("Processing Gpay payment of "+amount);
    }
    void verifyEmail()
    {
        System.out.println("Verifying Gpay account "+email);
    }
}
public class Casting 
{
    public static void main(String[]a)
    {
        //Upcasting
        Payment pObj = new Gpay();
        pObj.process();

        //pObj.verifyEmail();//error

        //Downcasting
        if (pObj instanceof Gpay) 
        {
            Gpay gObj = (Gpay) pObj; //explicit cast
            gObj.verifyEmail();    
        }
    }
    
}
