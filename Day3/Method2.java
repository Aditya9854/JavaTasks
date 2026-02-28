public class Method2 
{
    //method accepts two parameters and returns multiplication
    public int mult(int iNo1,int iNo2)
    {
        return iNo1 * iNo2;
    }
    public static void main(String []a)
    {
        Method2 mObj = new Method2();

        int Res = mObj.mult(12, 10);

        System.out.print(Res);

    }
    
}
