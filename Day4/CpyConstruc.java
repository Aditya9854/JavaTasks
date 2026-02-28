public class CpyConstruc 
{
    String university;
    String department;

    //Parameterized constructor
    CpyConstruc(String uni,String dept)
    {
        university = uni;
        department = dept;
    }

    //Copy Constructor
    CpyConstruc(CpyConstruc obj1)
    {
        this.university = obj1.university;
        this.department = obj1.department;
    }

    void display()
    {
        System.out.println("University : "+university);
        System.out.println("Department : "+department);
    }

    public static void main(String[]a)
    {
        CpyConstruc cpObj = new CpyConstruc("SPPU","CS");
        CpyConstruc cpObj2 = new CpyConstruc(cpObj);

        cpObj2.display();

    }
    
}
