
class Calculation
{
    //public method 
    public static int mult(int iNo1, int iNo2)
    {
        return iNo1 * iNo2;
    }
}

public class AccessMod4
{
    public static void main(String[]a)
    {
        int res = Calculation.mult(12,13);

        System.out.println(res);
    }
    
}
