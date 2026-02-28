class User 
{
    //final variable
    final int User_ID;   //once assigned cannot be changed

    User(int id)
    {
        this.User_ID = id;
    }
    void changeID(int newId)
    {
       // User_ID = newId; //Cannot assign value to final variable
    }
    void display()
    {
        System.out.println("User ID : "+User_ID);
    }
    
}
public class UseOfFinal1 
{
    public static void main(String[]a)
    {
        User uObj = new User(1001);
        uObj.display();
    }
    
}
