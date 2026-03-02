interface Bulb
{
    void turnOn();
}

class LED implements Bulb
{
    public void turnOn()
    {
        System.out.println("LED : bright white light");
    }
}
class Neon implements Bulb
{
    public void turnOn()
    {
        System.out.println("Neon : Glows orange");
    }
}
class BulbFactory
{
    public static Bulb getBulb(String type)
    {
        if(type.equalsIgnoreCase("LED"))
            return new LED();
        if (type.equalsIgnoreCase("NEON")) 
            return new Neon();
        return null;
    }
}
public class Polymorphism 
{
    public static void main(String[]a)
    {
        Bulb bObj = BulbFactory.getBulb("LED");

        if (bObj != null) 
        {
            bObj.turnOn();   
        }
    }
}
