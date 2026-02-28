/*
    Build a calculator program supporting +, -, *, / using user input.
 */
import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] a){

        Scanner sc = new Scanner(System.in);

        System.out.println("-----Calculator------");

        System.out.print("Enter first Number : ");
        double dNo1 = sc.nextDouble();

        System.out.print("Enter an Operator (+,-,*,/):");
        char operator = sc.next().charAt(0);

        System.out.print("Enter Second Number : ");
        double dNo2 = sc.nextDouble();

        double Result;

        switch (operator) {
            
            case '+' -> Result = dNo1 + dNo2;
            case '-' -> Result = dNo1 - dNo2;
            case '*' -> Result = dNo1 * dNo2;
            case '/' -> {
                           if(dNo2 != 0){
                            Result = dNo1 / dNo2;

                           }
                           else{
                            System.out.println("Cannot Divide by Zero.");
                            return;
                           }

                        }
            default -> {
                        System.out.println("Invalid operator!");
                        return;
            }            
        }

        System.out.printf("%.2f %c %.2f = %.2f",dNo1,operator,dNo2,Result);

    }

}
