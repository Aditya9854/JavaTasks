public class FindDuplicate 
{
    public static void main(String[] a) 
    {
        int[] numbers= {2,4,5,6,2,8,5};
        
        System.out.println("Duplicate Elements : ");
        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = i + 1; j < numbers.length; j++)
            {
                if (numbers[i] == numbers[j]) 
                {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
    
}
