import java.util.Scanner;

public class ConditionalStatements2 
{
    public static void main(String []a)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score to check your grade : ");
        int score = sc.nextInt();

        //if- else if-else ladder
        if (score >= 90) 
        {
            System.out.println("Grade : A");
        }
        else if (score >= 80) 
        {
            System.out.println("Grade : B");
        }
        else if (score >= 70) 
        {
            System.out.println("Grade : C");
        }
        else
        {
            System.out.println("Grade : F");
        }
        sc.close();
    }
    
}
