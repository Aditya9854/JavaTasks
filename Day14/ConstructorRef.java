import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
    String name;

    public Student(String name)
    {
        this.name = name;
    }
    public String toString()
    {
        return "Student : "+name;
    }
}
public class ConstructorRef 
{
    public static void main(String[] a) 
    {
        List<String> sNames = Arrays.asList("shree","anup","viraj");
        
        //using lambda : name -> new Sudent(name)
        //-\\- constructor ref : Student :: new
        List<Student>students = sNames.stream()
                                      .map(Student :: new)                //constructor ref
                                      .collect(Collectors.toList());

        students.forEach(System.out::println);
    }    
}
