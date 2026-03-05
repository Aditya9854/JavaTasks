import java.util.Arrays;

public class ArrayStream1 
{
    public static void main(String[]a)
    {
        int[] ages = {12,13,25,17,40,15,22};

        //filter()
        System.out.println("Adults(18+) : ");
        Arrays.stream(ages)
              .filter(age -> age >= 18)
              .forEach(System.out::println);
    }
    
}
