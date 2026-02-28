class Member1 
{
    String name = "Jay";
    
    void login()
    {
        System.out.println("User logged into the portal");
    }
}
class student1 extends Member1
{
    public void submitAssignment()
    {
        System.out.println(name+" has submitted Assignment");
    }
}
public class SingleLvl 
{
    public static void main(String []a)
    {
        student1 sObj = new student1();
        sObj.login();
        sObj.submitAssignment();
    }
    
}
