import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
public class DeserializeDemo 
{
    public static void main(String[] a) 
    {
        User user = null;
        
        try(FileInputStream fileIn = new FileInputStream("user.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn))
        {
            //read the obj and cast it to the correct class
            user = (User) in.readObject();

            //verify restore values
            System.out.println("---object Restored---");
            System.out.println("username : "+user.Username);
            System.out.println("Email : "+user.email);

            //it was marked transeient so it will be null
            System.out.println("Session : "+user.sessionToken);
        }
        catch(IOException e)
        {
            System.err.println("IO error : "+e.getMessage());
        }
        catch(ClassNotFoundException e)
        {
            System.err.println("Error: class defination for the object not found.");
            e.printStackTrace();
        }
    }    
}
