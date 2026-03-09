
//Creating custom Exception

import java.util.HashSet;
import java.util.Set;

class UserExistException extends Exception
{
    public UserExistException(String message)
    {
        super(message);
    } 
}
class RegisterUser
{
    private Set<String> TakenUserName = new HashSet<>(Set.of("admin","java_Coder"));

    public void addUser(String username) throws UserExistException
    {
        if(TakenUserName.contains(username.toLowerCase()))
        {
            throw new UserExistException("Username '"+username+"' is already in use.");
        }
        System.out.println("Registration Successful! Welcome "+username);
        TakenUserName.add(username.toLowerCase());
    }
}
public class CheckedExcep2
{
    public static void main(String[] a)
    {
       RegisterUser service = new RegisterUser();

       try
       {
            service.addUser("admin");
       }
       catch(UserExistException e)
       {
            System.err.println("Signup Failed :"+e.getMessage());
            System.out.println("Please try different Username.");
       }
    }
}