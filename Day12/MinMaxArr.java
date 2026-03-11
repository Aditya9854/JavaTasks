public class MinMaxArr 
{
    public static void main(String[] a) 
    {
        int[] numbers = {33,4,2,69,54,23,78};
        
        if(numbers.length == 0)
        {
            System.out.println("Array is Empty");
            return;
        }

        int smallest = numbers[0];
        int largest = numbers[0];

        for(int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] > largest) 
            {
                largest = numbers[i];    
            }
            else if (numbers[i] < smallest )
            {
                smallest = numbers[i];
            }
        }
        System.out.println("Largest Number : "+largest);
        System.out.println("Smallest Number : "+smallest);
    }    
}
