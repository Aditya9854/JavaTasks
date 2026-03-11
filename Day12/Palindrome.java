public class Palindrome 
{
    public static void main(String[] a) 
    {
        int iNo = 132;
        System.out.println("Given number "+iNo+"is palindome? : "+isNumPalindrome(iNo));

    }
    public static boolean isNumPalindrome(int iNo)
    {
        if (iNo < 0) return false;

        int num = iNo;
        int revNum = 0;

        while (num != 0) 
        {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;    
        }
        return iNo == revNum;
    }
    
}