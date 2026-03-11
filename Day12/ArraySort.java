public class ArraySort 
{
    public static void main(String[] a) 
    {
        int[] arr = {88,43,23,21,44,67,12};
        
        for(int i = 0; i < arr.length -1; i++)
        {
            for(int j = 0; j < arr.length-i-1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+ 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array : ");
        for(int num : arr)
        {
            System.out.print(num+" "); 
        }
    }    
}
