import java.sql.DriverManager;

public class PrintClassLoader
{
    public static void main(String[] a)
    {
        //Application ClassLoader(system class loader)
        System.out.println("ClassLoader of this class : "+PrintClassLoader.class.getClassLoader());

        //Platform ClassLoader
        //loads classes from 'java.sql'module or standerd extensions
        System.out.println("ClassLoader of Driver Manager : "+DriverManager.class.getClassLoader());

        //Bootstrap  classLoader 
        //Loads classes like String or ArrayList
        System.out.println("ClassLoader of String : "+String.class.getClassLoader()); //will return null because it is implemented in native code
        
    }
}