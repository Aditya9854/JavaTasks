
interface Payment
{
    //abstract method
    void process(double amt);
    
    //default method
    default void notify(double amt)
    {
        System.out.println("Transaction of "+amt+" successful.");
    }
}
class CreditCard implements Payment
{
    public void process(double amt)
    {
        System.out.println("Processing Credit card payment : "+amt);
    }
    //this class can use default notify method
}
class CreptoPayment implements Payment
{
    public void process(double amt)
    {
        System.out.println("Processing bitcoin transaction : "+amt);
    }
    //overriding default notify method
    public void notify(double amt)
    {
        System.out.println(amt+ " added to ledger.");
    }
}
public class DefaultMethodInfc 
{
    public static void main(String[] a) 
    {
        Payment p1 = new CreditCard();
        p1.process(100.0);
        p1.notify(100.0);

        Payment p2 = new CreptoPayment();
        p2.process(50.0);
        p2.notify(50.0);
    }    
}
