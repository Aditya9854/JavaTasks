/*
    - Create a Temperature Converter (Celsius ↔ Fahrenheit) using methods.
 */
import java.util.Scanner;

public class TempConverter 
{

    public static double toCelsius(double f)
    {
        return (f - 32) * 5 / 9;
    }

    public static double toFahrenheit(double c)
    {
        return (c * 9 / 5)+32;
    }

    public static void main(String []a)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("-----Temperature Convertor------");
        System.out.println("1: Fahrenheit -> celsius");
        System.out.println("1: celsius -> Fahrenheit");
        System.out.print("Enter choise (1 or 2) :");
        int choise = sobj.nextInt();

        System.out.print("Enter Temperature : ");
        double tValue = sobj.nextDouble();

        switch (choise) {
            case 1:
                System.out.printf("%.2fF <-> %.2fC",tValue,toCelsius(tValue));
                break;
            case 2:
                System.out.printf("%.2fC <-> %.2fF",tValue,toFahrenheit(tValue));  
                break;  
        
            default:
                System.out.println("Invalid choise choose either 1 or 2.");
        }
    }
    
}
