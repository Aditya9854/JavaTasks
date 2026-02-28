
class Employee
{
    private String name;  //Private variable

    public void setName(String name)
    {
        this.name = name;   //accessible in same class
    }
    public String getName()
    {
        return name;
    }

}

public class AccessMod1 
{
    public static void main(String[]a)
    {
        Employee emp = new Employee();

        emp.setName("Abc");
        //System.out.println(emp.name); //error
        System.out.println(emp.getName());
    }
    
}
