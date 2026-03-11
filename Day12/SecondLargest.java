public class SecondLargest 
{
    public static void main(String[] a) 
    {
        int[] arr = {10,5,1,20};
        
        //sorting array
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
        int n = arr.length;
        int largest = arr[n-1];
        int secondLargest = - 1; //default 

        for(int i = n-2; i >= 0; i--)
        {
            if (arr[i] != largest) 
            {
                secondLargest = arr[i];
                break;    
            }
        }
        System.out.println("Second largest number in array : "+secondLargest);
    }    
}
