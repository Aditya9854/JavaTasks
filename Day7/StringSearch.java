public class StringSearch
{
    public static void main(String []a)
    {
        String sentence = "To be or not to be that is the question";

        System.out.println("First 'be' : "+sentence.indexOf("be")); //3
        System.out.println("Last 'be' : "+sentence.lastIndexOf("be")); //16
        System.out.println("Index of 'x' : "+sentence.indexOf("X")); //-1 (not found)
    }
}
