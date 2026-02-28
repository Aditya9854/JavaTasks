class Laptop
{
    void startupSound()
    {
        System.out.println("Generic Beep");
    }
}
class MacBook extends Laptop
{
    void startupSound()
    {
        System.out.println("Mac Chime"); 
    }
}
class Windows extends Laptop
{
    void startupSound()
    {
        System.out.println("Windows Melody");
    }
}
public class DynamicDispatch 
{
    public static void main(String[]a)
    {
        Laptop myLpt;

        myLpt = new MacBook();
        myLpt.startupSound();

        myLpt = new Windows();
        myLpt.startupSound();
    }
}
