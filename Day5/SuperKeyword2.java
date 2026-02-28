class Person
{
    String name;

    Person(String name)
    {
        this.name = name;
        System.out.println("Person constructor :Name set  to "+name);
    }
}
class Employee extends Person {

    int id;

    Employee(String name, int id)
    {
        super(name); //calling Person constructor using super()
        this.id = id;
        System.out.println("Employee Constructor.:Id set to "+id);
    }

    void showDetails()
    {
        System.out.println("ID: "+id +", Name: "+name);
    }
}

public class SuperKeyword2 {
    public static void main(String[]a)
    {
        Employee emp = new Employee("Ajit", 101);
        emp.showDetails();       
    }
}
