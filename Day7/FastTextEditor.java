//StringBuilder : best for single thread,not thread safe but very fast
public class FastTextEditor 
{
    public static void main(String []a)
    {
        StringBuilder document = new StringBuilder("Initial Draft:");

        document.append("\n-Added chapter 1");
        document.append("\n-Added chapter 2");

        //Inserting text at specific location
        document.insert(14, " (Confidential)");

        //deleting portion
        document.delete(0, 7); //removes 'initial'

        System.out.println("Final document content : ");
        System.out.println(document.toString());

    }
    
}
