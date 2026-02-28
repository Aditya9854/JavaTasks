/*
    Write a program to take 5 numbers from the user and find the average.
 */
import java.util.Scanner;

public class AvgCal {

    public static void main(String []a){

        Scanner sobj = new Scanner(System.in);

        double sum = 0;
        int count = 5;

        System.out.println("Enter "+count+"numbers :");

        for(int i = 1; i<= count; i++){
            System.out.println("Number "+i+":");
            double iNo = sobj.nextDouble();
            sum += iNo;
        }

        double average = sum /count;
        
        System.out.println("Sum :"+sum);
        System.out.println("Average : "+average);
    }
    
}
