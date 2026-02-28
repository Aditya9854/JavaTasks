class SuperCL
{
    //Method Overloading
    void display(int id)
    {
        System.err.println("ID : "+id);
    }
    void display(int id ,String name)
    {
        System.err.println("ID : "+id+ "| Name : "+name);
    }
    void display(int id,String name,String course)
    {
        System.err.println("ID : "+id+ "| Name : "+name+"| Course : "+course);
    }
    
}
public class OverloadDemo 
{
    public static void main(String[]a)
    {
        SuperCL sObj = new SuperCL();

        sObj.display(1);
        sObj.display(2, "jay");
        sObj.display(2, "jay", "CS");
    }
    
}
