class Member
{
    void login()
    {
        System.out.println("User logged into the portal");
    }
}
class Student extends Member
{
    void submitAssignment()
    {
        System.out.println("Assignment Submitted Successfully.");
    }
}
class Teacher extends Member
{
    void postGrade()
    {
        System.out.println("Grades have been Updated.");
    } 
}
public class Hierarchical {
    
    public static void main(String[]a)
    {
        Student sObj = new Student();
        Teacher tObj = new Teacher();

        sObj.login();
        sObj.submitAssignment();

        tObj.login();
        tObj.postGrade();

    }
}
