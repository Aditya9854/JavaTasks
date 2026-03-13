import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

class Book
{
    String title;
    Book(String title)
    {
        this.title = title;
    }
    String geTitle()
    {return title;}
}
public class OptionalOrElse 
{
    public static void main(String[] a) 
    {
        Map<Integer,Book> catalog = new HashMap<>();

        catalog.put(101, new Book("Java"));
        catalog.put(102, new Book(null));       //book exist but title null

        printBookTitle(catalog, 101);
        printBookTitle(catalog, 102);
        printBookTitle(catalog, 999);
        
    }   
    public static void printBookTitle(Map<Integer,Book> catalog,int id)
    {
        try
        {
            String title = Optional.ofNullable(catalog.get(id))   //checking if book exist
                                    .map(Book::geTitle)          //getting title
                                    .orElse("Untitled");   //if title is null

            //if book itself not exist
            Optional.ofNullable(catalog.get(id))
                    .orElseThrow(()-> new NoSuchElementException("Book Id: "+id+" not found!"));
    
            System.out.println("Id : "+id+" Title : "+title);
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e.getMessage());
        }
    } 
}
