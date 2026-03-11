public class RevStr 
{
    public static void main(String[] a) 
    {
        String str = "test";
        String revString = "";

       int size = str.length();

       for(int i = size-1; i >= 0; i--)
       {
            revString += str.charAt(i);
       }

       System.out.println("Before : "+str);
       System.out.println("After reversing : "+revString);
            
    }    
}
