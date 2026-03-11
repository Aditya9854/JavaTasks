public class CheckPrime 
{
    public static void main(String[] a) 
    {
        int num = 23;
        boolean isPrime = true;
        
        if (num <= 1) 
        {
            isPrime = false;    
        }
        else
        {
            for(int i = 2; i * i <=num; i++)
            {
                if (num % i == 0) 
                {
                    isPrime = false;
                    break;    
                }
            }
        }
        if (isPrime) 
        {
            System.out.println(num +" is prime.");    
        }
        else
        {
            System.out.println(num +" is not prime.");
        }
    }
}
