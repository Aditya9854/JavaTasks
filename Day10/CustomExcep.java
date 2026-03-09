class InvalidPassException extends Exception
{
    public InvalidPassException(String msg)
    {
        super(msg);
    }
}
class vault
{
    public void open(int code)throws InvalidPassException
    {
        if (code != 1234) 
        {
            throw new InvalidPassException("Wrong code!");   
        }
        System.out.println("Vault Opened.");
    }
}
public class CustomExcep 
{
    public static void main(String[] a) 
    {
        vault vl = new vault();
        
        try
        {
            vl.open(9999);
        }
        catch(InvalidPassException e)
        {
            System.err.println("Alert:"+e.getMessage());
        }
        finally
        {
            System.out.println("Security System check complete.");
        }
    }    
}
