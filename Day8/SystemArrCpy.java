import java.util.Arrays;

public class SystemArrCpy 
{
    public static void main(String[] a) 
    {
        int[] source = {11,22,44,53,66,};
        int[] dest = new int[5];
        
        //parameters: (source,sourceStart,dest,destStart,length)
        System.arraycopy(source, 1, dest, 2, 3);
        System.out.println("System.arraycopy : "+Arrays.toString(dest));
    } 
}
