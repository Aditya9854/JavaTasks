interface CheckUtility
{
    int operation(int a, int b);

    //static method
    static boolean isPositive(int n)
    {
        return n > 0;
    }
}
public class StaticMethodInfc 
{
    public static void main(String[]a)
    {
        int iNo1 = 14,iNo2 = -15;

        System.out.println(iNo1+" is +ve ? : "+CheckUtility.isPositive(iNo1));
        System.out.println(iNo2+" is +ve ? : "+CheckUtility.isPositive(iNo2));

    }   
}
