/*
    Create a Student class with fields (id, name, marks) and display them.
 */
public class DiplayStdInfo 
{

    private int id;
    private String name;
    private double marks;

    public DiplayStdInfo(int id,String name,double marks)
    {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public void Diplay()
    {
        System.out.println("-------Student Records------");
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Marks : "+marks);
    }

    public static void main(String []a)
    {
        DiplayStdInfo obj1 = new DiplayStdInfo(1, "Ajay", 95);
        DiplayStdInfo obj2 = new DiplayStdInfo(2, "Vijay", 90);

        obj1.Diplay();
        obj2.Diplay();

    }
    
}
