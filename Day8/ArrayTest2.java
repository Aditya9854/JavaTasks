public class ArrayTest2
{
    public static void main(String[]a)
    {
        int[] myNumbers = {5,7,34,32,2};

        //Accessing array elements
        System.out.println("First element :"+myNumbers[0]);
        System.out.println("Second element :"+myNumbers[1]);

        //updaating 
        myNumbers[2] = 4;
        myNumbers[3] = 6;
        System.out.println("Third element :"+myNumbers[2]);
        System.out.println("Fourth element :"+myNumbers[3]);
    }
}  