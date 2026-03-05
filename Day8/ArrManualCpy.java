import java.util.Arrays;

public class ArrManualCpy 
{
    public static void main(String[] a)
    {
        int[] source = {6,7,3,2,4,1};
        int[] destination = new int[6];

        for(int i = 0; i < source.length; i++)
        {
            destination[i] = source[i];
        }

        System.out.println("Mannual Copy : "+Arrays.toString(destination));
    }    
}
