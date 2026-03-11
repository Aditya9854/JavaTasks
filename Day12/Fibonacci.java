public class Fibonacci 
{
    public static void main(String[] a) 
    {
        int N = 10;
        int first = 0, second = 1;

        System.out.println("Fibonacci series upto "+N+" numbers : ");

        for(int i = 1; i <= N; i++)
        {
            System.out.print(first + (i < N ? ",":""));

            int next = first + second;

            first = second;
            second = next;
        }
    }
}
