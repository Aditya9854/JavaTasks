//Use of throw
import java.util.Scanner;

public class TestThrow 
{
    public static void checkEligiblity(int age)
    {
        if(age < 18)
        {
            throw new ArithmeticException("Underage: Access denied for voting.");
        }
        else
        {
            System.out.println("Welcome!Please cast your vote.");
        }
    }
    public static void main(String[] a) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        checkEligiblity(age);
        sc.close();
    }    
}
