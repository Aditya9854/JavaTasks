/*
    Make a Menu Driven Program: 1) Add 2) Subtract 3) Multiply 4) Divide Exit when user selects 0.

*/
import java.util.Scanner;

public class Calculator2 {

    public static double add(double dNo1,double dNo2)
    {
        return dNo1 + dNo2;
    }
    public static double sub(double dNo1,double dNo2)
    {
        return dNo1 - dNo2;
    }
    public static double mult(double dNo1,double dNo2)
    {
        return dNo1 * dNo2;
    }
    public static double div(double dNo1,double dNo2)
    {
        if (dNo2 == 0) 
        {
            System.out.println("Err:Divide by zero");
            return 0;
        }
        else
        {
            return dNo1 / dNo2;
        }
    }
    
    public static void main(String []a)
    {
        Scanner sobj = new Scanner(System.in);
        int choise;

        do{
            System.out.println("------Calculator------");
            System.out.println("1) Addition ");
            System.out.println("2) Subtract ");
            System.out.println("3) Multiply ");
            System.out.println("4) Divide ");
            System.out.println("0) Exit ");
            System.out.print("Select an Option : ");
            choise = sobj.nextInt();

            if(choise >=1 && choise <=4)
            {
                System.out.println("Enter First Number : ");
                double no1 = sobj.nextDouble();

                System.out.println("Enter Second Number : ");
                double no2 = sobj.nextDouble();

                switch (choise) 
                {
                    case 1 -> System.out.println("Result : "+add(no1, no2));
                    case 2 -> System.out.println("Result : "+sub(no1, no2));
                    case 3 -> System.out.println("Result : "+mult(no1, no2));
                    case 4 -> System.out.println("Result : "+div(no1, no2));
                        
                     
                }

            }
            else if (choise != 0) {
                System.out.println("Invalid choise try again!");
            }

        }while(choise != 0);

    }
}
