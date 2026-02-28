/*
    Write a program using if/else and switch statements.
 */
import java.util.Scanner;

public class IfElseAndSwitch {

    public static void main(String []a)
    {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter student Score (0-100): ");
        int score = sObj.nextInt();
        
        char grade;

        if (score >= 90) {
            grade = 'A';
        }
        else if (score >=80) {
            grade = 'B';
        }
        else if (score >= 70) {
            grade = 'C';
        }
        else if (score >= 60) {
            grade = 'D';
        }
        else if (score >= 50) {
            grade = 'E';
        }
        else{
            grade = 'F';
        }

        String feedback = switch (grade){

            case 'A' ->"Excellent! Scholarship:5000";
            case 'B' ->"Very Good! Scholarship:2000";
            case 'C' ->"Good! Scholarship:1000";
            case 'D' ->"Passed! Scholarship:500";
            case 'E' ->"Passed! No Scholarship";
            case 'F' ->"Failed!";
            default ->"Invalid Grade state.";
        };

        System.out.println("Grade : "+grade);
        System.out.println("Result : "+feedback);
    } 
    
}
