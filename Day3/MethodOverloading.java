
public class MethodOverloading
{
    
    void display(int iNo)
    {
        System.out.println("Integer value :"+iNo);
    }
    void display(String name)
    {
        System.out.println("String value :"+name);
    }
    void display(double dNo)
    {
        System.out.println("Double value :"+dNo);
    }

    public static void main(String[]a)
    {
        MethodOverloading mObj = new MethodOverloading();

        mObj.display(14);
        mObj.display("java");
        mObj.display(47.66);

    }
}