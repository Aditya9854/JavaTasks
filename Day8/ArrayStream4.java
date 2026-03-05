import java.util.Arrays;

public class ArrayStream4
{
    public static void main(String[] a) 
    {
        int[] numbers = {2,4,5,1,6,7,9,8,3};

        //sum of all numbers
        int totalSum = Arrays.stream(numbers).sum();

        //Numbers > 5
        long greatNum = Arrays.stream(numbers)
                             .filter(n -> n > 5)
                             .count();
        
        System.out.println("Total : "+totalSum);
        System.out.println("Count of Number > 5 : "+greatNum);
    }
    
}
