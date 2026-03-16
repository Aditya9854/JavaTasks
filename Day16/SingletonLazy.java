class BasicSingleton
{
    //private static variable to hold the singleton instance
    private static BasicSingleton instance;

    //private constructor so no one else can use 'new'
    private BasicSingleton()
    {
        System.out.println("Singleton instance Created!");
    }
    //public static method to provide the instance 
    public static BasicSingleton getInstance()
    {
        if (instance == null) 
        {
            instance = new BasicSingleton();    
        }
        return instance;
    }
    public void showMessage()
    {
        System.out.println("MSG from singleton.!");
    }
}
public class SingletonLazy
{
    public static void main(String[]a)
    {
        BasicSingleton s1 = BasicSingleton.getInstance(); //will trigger the created msg

        BasicSingleton s2 = BasicSingleton.getInstance(); //will not trigger msg it just reuses s1

        //both variables points to the same memory
        System.out.println(s1 == s2); //true

    }
} 