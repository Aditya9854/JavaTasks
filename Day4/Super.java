//1.calling base class method Using super() 


class Base 
{
    void display()
    {
        System.out.println("This is base class method");
    }
}
class Derived extends Base 
{
    void display()
    {
        System.out.println("This is derived class method");
    }  
    void print()
    {
        //this will call derived class's display()
        display();
        //this will call base class's display()
        super.display();
    }
}

public class Super
{
    public static void main(String[]a)
    {
        Derived dObj = new Derived();

        dObj.print();
    }
    
}
