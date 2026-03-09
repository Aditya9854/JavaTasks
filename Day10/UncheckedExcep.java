
public class UncheckedExcep 
{
    public static void main(String[] a)
    {
        String[] inputs = {"10","0","abc",null};

        for(String input : inputs)
        {
            try
            {
                int num = Integer.parseInt(input);
                int result = 100/num;

                System.out.println("Result for "+input+": "+result);
            }
            catch(ArithmeticException e)
            {
                System.err.println("Error: Cannot divide by Zero.");
            }
            catch(NumberFormatException | NullPointerException e)
            {
                System.err.println("Error :'"+input+"' is not valid number.");
            }
        }
    }    
}
