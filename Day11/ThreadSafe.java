//Thread Safety via immutability
final class UserProfile
{
    private final String username;
    private final int userId;

    public UserProfile(String username,int userId)
    {
        this.username = username;
        this.userId = userId;
    }
    //only getters
    public String getUname(){return username;}
    public int getUid(){return userId;}

}
public class ThreadSafe 
{
    public static void main(String[] a)
    {
        //This obj can be shared across 100 threads safely beacause its fields cannot change
        UserProfile profile = new UserProfile("User-A", 101);
    }    
}
