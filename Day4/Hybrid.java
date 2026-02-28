interface Control
{
    void changeChannel();
}
class Device
{
    void plugIn()
    {
        System.out.println("Device Connected to power.");
    }
}
class SmartTv extends Device implements Control
{
    public void changeChannel()
    {
        System.out.println("Switching to another channel...");
    }
}
public class Hybrid 
{
    public static void main(String[]a)
    {
        SmartTv sObj = new SmartTv();

        sObj.plugIn();
        sObj.changeChannel();
    }
    
}
