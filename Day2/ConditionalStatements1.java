import java.util.Scanner;

public class ConditionalStatements1 
{
    public static void main(String[]a)
    {
        Scanner sc = new Scanner(System.in);
        
        int age;
        System.out.print("Enter Your Age : ");
        age = sc.nextInt();

        //if else statement
        if (age > 18)
        {
            System.out.println("Your Eligible to vote.");    
        }
        else
        {
            System.out.println("Your not Eligible to vote.");
        }
        sc.close();
    }
    
}
