
class Base
{
    protected int uid;
    protected String Role;

}
class subclass extends Base
{
     subclass(int id,String rl)
     {
        this.uid = id;
        this.Role = rl;
     }
     void display()
     {
        System.out.println("ID : "+uid);
        System.out.println("Role : "+Role);
     }
    
}

public class AccessMod3
{
    public static void main(String[]a)
    {
        subclass sobj = new subclass(1001, "Admin");
        //protected members of base class accessed via subclass
        sobj.display();
    }
    
}
