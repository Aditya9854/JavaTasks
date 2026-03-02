class Person
{
    private int age;

    public int getAge()
    {
        return age;
    }

    public void setAge(int newAge)
    {
        if (newAge > 0 &&  newAge < 120) 
        {
            this.age = newAge;    
        }
        else
        {
            System.out.println("Invalid Age");
        }
    }
}
public class GetSet 
{
    public static void main(String []a)
    {
        Person p1 = new Person();

        p1.setAge(24);
        System.out.println("Age : "+p1.getAge());
    }
}
