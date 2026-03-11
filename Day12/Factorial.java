public class Factorial 
{
    public static void main(String[] a) 
    {
        int iNo = 5;
        long res = findFactorial(iNo);
        System.out.println("Factorial of "+iNo+" is : "+res);
        
    }   
    public static long findFactorial(int num)
    {
        //0!,1! always 1
        if (num <= 1) 
        {
            return 1;
        }

        return num * findFactorial(num - 1);
    } 
}
