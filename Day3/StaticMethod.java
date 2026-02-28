public class StaticMethod 
{
    //static variable
    static int iNo;

    //static block
    static
    {
        System.out.println("Inside static block.");
        iNo = 10;

    }

    //static Method
    static void stMethod()
    {
        System.out.println("Inside static method.");
        //return 10;
    }

    public static void main(String []a)
    {

        System.out.println("Value of a :"+iNo);
        System.out.println("From main");

    }
    
}
