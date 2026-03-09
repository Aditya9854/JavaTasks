//Try catch finally internal flow
public class InternalFlow 
{
    public static void main(String[] a)
    {
        System.out.println("->Opening DB connection..");

        try
        {
            //unchecked exception (eg--suppose clmn not found)
            int result = 10/0;

            System.out.println("->This line will never run.");
        }
        catch(ArithmeticException e)
        {
            System.out.println("->Exceptiom caught : Cannot divide by zero.");
        }
        finally
        {
            System.out.println("->Closing Db connection(Finally)");
        }
        System.out.println("->Program Continues normally.");
    }    
}
