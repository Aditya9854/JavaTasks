import java.util.Arrays;

public class ArraysCpyOf 
{
    public static void main(String[] a) 
    {
        int[] src = {12,14,1,56};
        
        int[] dest = Arrays.copyOf(src, 4);

        System.out.println("Arrays.copyof : "+Arrays.toString(dest));
    }    
}
