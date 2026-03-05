import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] a) 
    {
        int[] arr = {65,30,24,12,33};
        
        //bubble sort logic
        for(int i = 0; i < arr.length-1; i++)
        {
            for(int j = 0; j < arr.length-1-i; j++)
            {
                if (arr[j] > arr[j+1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;    
                }
            }
        }
        System.out.println("Bubble sorted : "+Arrays.toString(arr));
    }    
}
