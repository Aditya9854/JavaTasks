class Device1 
{
    void powerOn()
    {
        System.out.println("Device is starting up..");
    }
}
class Computer extends Device1
{
    void bootOS()
    {
        System.out.println("Loading the Operating System...");
    }
}
class Laptop extends Computer
{
    void checkBattery()
    {
        System.out.println("Battery at 86%");
    }
}
public class MultiLvl 
{   
     public static void main(String[]a)
    {
        Laptop mac = new Laptop();

        mac.powerOn();
        mac.bootOS();
        mac.checkBattery();
    }
}
