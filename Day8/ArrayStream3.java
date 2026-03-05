import java.util.Arrays;

public class ArrayStream3 
{
    public static void main(String[] a) 
    {
        int[] scores = {85,60,95,55,86};
        
        System.out.println("Scores in Accending order : ");

        Arrays.stream(scores)
              .sorted()
              .forEach(System.out::println);
    }  
}
