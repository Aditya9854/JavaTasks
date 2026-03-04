public class StringCompare 
{
    public static void main(String[]a)
    {
        String str1 = "PROGRAM";
        String str2 = "program";

        System.out.println("Case Sensitive : "+str1.equals(str2));//false
        System.out.println("Ignore Case : "+str1.equalsIgnoreCase(str2));//true

    }
    
}
