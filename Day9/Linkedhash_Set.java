import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhash_Set 
{
    public static void main(String[]a)
    {
        //LinkedHashSet maintains the order of insertion
        Set<String> recentSearches = new LinkedHashSet<>();

        //User searches for these terms
        recentSearches.add("java tutorials");
        recentSearches.add("what is linkedHashSet");
        recentSearches.add("Best IDE for java");

        //user searches for duplicate term
        recentSearches.add("java tutorials");

        System.out.println("----Your recent Searches----");
        //it will print exact order they were added
        for(String search : recentSearches)
        {
            System.out.println("-> "+search);
        }

        //checking if searched before
        if (recentSearches.contains("java tutorials")) 
        {
            System.out.println("Status : You have already viewed java tutorials");    
        }
    }    
}
