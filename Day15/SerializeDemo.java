import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable
{
    private static final long serialVersionUID = 1L; //its like fingerprint for class version

    String Username;
    String email;

    //transient -this field will not be saved
    transient String sessionToken;

    public User(String username, String email, String sessionToken)
    {
        this.Username = username;
        this.email = email;
        this.sessionToken = sessionToken;
    }
}
public class SerializeDemo 
{
    public static void main(String[] a) 
    {
        User user = new User("User-1", "user@example.com", "ABC.ser");

        try(FileOutputStream fos = new FileOutputStream("user.ser");
             ObjectOutputStream out = new ObjectOutputStream(fos))
        {
            out.writeObject(user);

            System.out.println("Success: Object serialize to 'user.ser'");
        }
        catch(IOException e)
        {
            System.err.println("Error during serialization : "+e.getMessage());
        }
    }    
}
