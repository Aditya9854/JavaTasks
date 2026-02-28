import java.util.Scanner;

public class ConditionalStatements3 
{
    public static void main(String []a)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int iNo = sc.nextInt();

        //Ternary Operator( ? :)
        //Syntax-- variable = (condition) ? valueiftrue : valueiffalse
        String Res = (iNo % 2 == 0) ? "Even" : "Odd";

        System.out.println("Number is "+Res);

        sc.close();
    }
    
}
