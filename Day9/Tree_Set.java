import java.util.Collections;
import java.util.TreeSet;

public class Tree_Set 
{
    public static void main(String[] a) 
    {
        
        //Storing scores of players 
        // Collection.reverseOrder():to get scores in decending order
        TreeSet<Integer> scores = new TreeSet<>(Collections.reverseOrder()); 
       
        scores.add(100);
        scores.add(240);
        scores.add(80);
        scores.add(70);
        scores.add(100); //duplicate will be ignored

        System.out.println("----Top Scores----");
        for(Integer score : scores)
        {
            System.out.println("Points : "+score);
        }

        //Special TreeSet methods
        System.out.println("Top Score : "+scores.first());
        System.out.println("lowest : "+scores.last());
    }    
}
