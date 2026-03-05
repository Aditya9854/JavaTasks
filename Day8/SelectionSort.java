import java.util.Arrays;

public class SelectionSort 
{
    public static void main(String[] a)
    {
        int[] arr = {64,33,12,11,70};

        for(int i = 0; i < arr.length -1; i++)
        {
            int minIndex = i;   //Asumming 1st ele is smallest

            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[j] < arr[minIndex])
                {
                    minIndex = j; //new smallest ele
                }
            }
            //swapping smallest with first
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Selection Sorted : "+Arrays.toString(arr));
    }    
}
