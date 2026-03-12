public class GenMethod 
{
    static <T> void display(T value)
    {
        System.out.println(value);
    }
    public static void main(String[] a) 
    {
        display(10);
        display("str");
        display(3.14);
    }    
}
