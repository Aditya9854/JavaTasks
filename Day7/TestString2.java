public class TestString2
{
    public static void main(String []a)
    {
        //declare using string literal
        String str1 = "myStr";
        String str2 = "myStr";

        //declare using new Keyword
        String str3 = new String("myStr"); 
        String str4 = new String("myStr");
  
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println( str1 == str2);//true
        System.out.println(str2 == str3);//false
        System.out.println(str3 == str4);//false
        System.out.println(str3.equals(str4));//true --checks content
        

    }
}