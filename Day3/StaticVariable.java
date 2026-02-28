public class StaticVariable 
{
    int rollNo;
    String name;

    //static variable
    static String course = "CS";

    StaticVariable(int val,String sName)
    {
        rollNo = val;
        name = sName;
    }
    void display()
    {
        System.out.println(rollNo+" "+name+" "+course);
    }
 
    public static void main(String[]a)
    {
        StaticVariable sObj1 = new StaticVariable(1, "ABC");
        StaticVariable sObj2 = new StaticVariable(2, "XYZ");

        sObj1.display();
        sObj2.display();

    }
    
}
