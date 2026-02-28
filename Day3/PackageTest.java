//User defined packages
import packDemo.DivisionA;
import packDemo.DivisionB;
//import packDemo.*;

public class PackageTest 
{
    public static void main(String[]a)
    {
        DivisionA dobj1 = new DivisionA();
        DivisionB dobj2 = new DivisionB();

        dobj1.display();
        dobj2.display();
    }
}