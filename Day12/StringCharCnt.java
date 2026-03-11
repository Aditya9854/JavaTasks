import java.util.Arrays;

public class StringCharCnt 
{
    public static void main(String[] args) 
    {
        String str = "test string";
        
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        for(int i = 0; i < chars.length; i++)
        {
            int cnt = 1;

            while (i+1 < chars.length && chars[i] == chars[i+1]) 
            {
                cnt++;
                i++;    
            }
            System.out.println("'"+chars[i]+"' : "+cnt);
        }
    }    
}
