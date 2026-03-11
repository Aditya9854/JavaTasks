public class PalindromeStr 
{
    public static void main(String[] a) 
    {
        String str = "Racecar";
        System.out.println("Given String "+str+" is palindome? : "+isStrPalindrome(str));

    }
    public static boolean isStrPalindrome(String str)
    {
        str = str.toLowerCase();

        int left = 0;
        int right = str.length() -1;

        while (left < right) 
        {
            if (str.charAt(left) != str.charAt(right)) 
            {
                return false;    
            }    
            left++;
            right--;
        }
        return true;
    }
    
}