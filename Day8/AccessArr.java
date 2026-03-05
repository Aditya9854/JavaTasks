public class AccessArr 
{
    public static void main(String[]a)
    {
        int[] ages = {17,19,25,26,30};

        //using for loop
        for(int i = 0; i < ages.length; i++)
        {
            System.out.println("At Index "+ i + ": "+ages[i]);
        }

        System.out.println("-------------------------------");
        
        //Enhanced for loop
        for(int age : ages)
        {
            System.out.println("value :"+age);
        }

    }
    
}
