import java.util.HashSet;
import java.util.Set;

public class Hash_Set 
{
    public static void main(String[] a) 
    {
        //HashSet to strore unique checked-In ids
        Set<String> checkedInAttendees = new HashSet<>();
        
        String[] scans = {"ID-001","ID-002","ID-001","ID-024","ID-002"};
        
        System.out.println("---Processing Scans---");

        for(String id : scans)
        {
            //.add() returns true if item was added(not duplicate)
            //.add() returns false if item already exist in set
            if(checkedInAttendees.add(id))
            {
                System.out.println("Welcome : id "+id+" verified Entry granted");
            }
            else
            {
                System.out.println("Rejected : id "+id+" has already exist");
            }
        }
        //count
        System.out.println("Total people currntly inside : "+checkedInAttendees.size());

        //check id
        String suspectId = "ID-024";
        if (checkedInAttendees.contains(suspectId)) 
        {
            System.out.println("ID is confirmed present");    
        }
    }   
}
