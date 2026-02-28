//Constructor Chaining using this

public class Constructor2 
{
    //Default Constructor 1
    Constructor2()
    {
        System.out.println("Default Constructor.");
    }

    //Parameterized constructor 2
    Constructor2(int iNo)
    {
        this(); //invoked def constructor
        System.out.println(iNo);
    }

    //Parameterized constructor 3
    Constructor2(int iNo,int iNo2)
    {
        this(15); //invoked parameterized constructor
        System.out.println(iNo * iNo2);
    }

    public static void main(String []a){

        //invokes Parameterized constructor 3
        new Constructor2(10,6);

    }
    
}
