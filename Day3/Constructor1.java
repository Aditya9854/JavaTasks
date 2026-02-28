public class Constructor1 
{
    String name;
    int marks;

    //Default  Constructor
    Constructor1()
    {
        System.out.println("This is Default constructor. ");
    }

    //Parameterized Constructor
    Constructor1(String name,int marks)
    {
        this.name = name;
        this.marks = marks;
    }

    //Copy Constructor
    Constructor1(Constructor1 objCpy)
    {
        this.name = objCpy.name;
        this.marks = objCpy.marks;
    }
    
    void display()
    {
        System.out.print("Name : "+name+" Marks :"+marks);
    }
    public static void main(String[]a)
    {
        Constructor1 obj =new Constructor1();
        Constructor1 obj2 = new Constructor1("virat", 80);

        obj2.display();

        //invoking copy constructor

        Constructor1 obj3 = new Constructor1(obj2);

        System.out.println("\n Name: "+obj3.name+" Marks :"+obj3.marks);


    }
    
}
