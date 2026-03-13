import java.util.Optional;

public class CreateOptional 
{
    public static void main(String[] a) 
    {
        //Creating optional with a guranteed value
        Optional<String> status = Optional.of("Active");
        
        //creating optional that might be null
        String dbResponce = null;
        Optional<String> result = Optional.ofNullable(dbResponce);
        
        status.ifPresent(val -> System.out.println("Status is: "+val));

        //if result is empty(null)
        String findOp = result.orElse("No data found");
        System.out.println("Result output : "+findOp);
    }    
}
