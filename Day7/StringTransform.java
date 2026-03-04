public class StringTransform 
{
    public static void main(String[]a)
    {
        String title = "Java Programming Guide ";

        String clean = title.trim(); //removes leading/trailing spaces
        String lower = clean.toLowerCase(); //java programming guide
        String slug = lower.replace(" ", "-");// java-programming-guide

        System.out.println("Original : ["+ title +"]");
        System.out.println("Final Slug :"+ slug);

        //substring: extract part of string
        System.out.println("First word : "+slug.substring(0,4));
    }
    
}
