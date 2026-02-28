import java.util.Scanner;

public class ConditionalStatements4 
{
    public static void main(String []a)
    {
        Scanner sc = new Scanner(System.in);
        int userRole;

        System.out.println("User Role : ");
        System.out.println(" \t 1)Admin \n\t 2)Editor \n\t 3)Guest");
        System.out.print("Select Option :");
        userRole = sc.nextInt();

        //Switch statement
        switch (userRole) {
            case 1:
                System.out.print("Full Access.");
                break;
            case 2:
                System.out.print("Edit Access.");    
                break;
            default:
                System.out.print("Guest Access.");
        }

        //modern switch 
        // String role = switch (userRole) {
        //     case 1 -> "Full Access.";
        //     case 2 -> "Edit Access";
        //     default -> "Guest Access";
                
        // };
        // System.out.println(role);
        sc.close();
    }
    
}
