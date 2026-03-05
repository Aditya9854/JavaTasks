import java.util.Arrays;

public class BinarySearch 
{
    public static void main(String[] a) 
    {
        //Array must  be sorted
        int[] sIDs = {10,20,25,56,60,75};
        int target = 60;

        //binary search
        int result = Arrays.binarySearch(sIDs, target);

        if (result >= 0) 
        {
            System.out.println("Student id "+target+" found at seat : "+result);    
        }
        else
        {
            System.out.println("ID not found!");
        }
    }
}
