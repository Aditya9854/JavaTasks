public class PrintStackTrace 
{
    public static void main(String[] a) 
    {
        try
        {
            int[] arr = new int[4];

            arr[5] = 15;
        }    
        catch(Throwable e)
        {
            e.printStackTrace();
        }
    }    
}
