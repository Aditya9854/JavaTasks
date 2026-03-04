public class StringInspection 
{
    public static void main(String a[])
    {
        String email = "user@Example.com";

        System.out.println("Length : "+email.length());//counts total characters
        System.out.println("Is Empty : "+email.isEmpty()); //false
        System.out.println("Character at index 0 : "+email.charAt(0)); //u
        System.out.println("Contains @ :"+email.contains("@"));//true
        System.out.println("Ends with .com :"+email.endsWith(".com"));//true
    }
}