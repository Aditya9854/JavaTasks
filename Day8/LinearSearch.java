public class LinearSearch
{
    public static void main(String[] a) 
    {
        int[] studentIDs = {104,101,103,402,405,501};
        int target = 103;
        int foundIndex = -1;

        //Linear search
        for(int i = 0; i < studentIDs.length; i++)
        {
            if (studentIDs[i] == target) 
            {
                foundIndex = i;
                break;    
            }
        }
        if (foundIndex != -1) 
        {
            System.out.println("Student id "+ target +" found at seat : "+foundIndex);    
        }
        else
        {
            System.out.println("Student id not found.");
        }
    }  
}
