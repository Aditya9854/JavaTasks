//Composition Example
class Engine
{
    void start()
    {
        System.out.println("Engine is starting..");
    }
}
class Car
{
    private final Engine eObj;

    Car()
    {
        this.eObj = new Engine();  //composition
    }
    void drive()
    {
        eObj.start();
        System.out.println("Car is Moving..");
    }
}
public class Composition
{
    public static void main(String[] a)
    {
        Car cObj = new Car();

        cObj.drive();
    }
}
