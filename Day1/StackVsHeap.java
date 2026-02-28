/*
    - Demonstrate stack vs heap by creating multiple objects and printing references.
 */
class Student{

    int marks;

    Student(int value)
    {
        this.marks = value; 
    }
}
public class StackVsHeap{

    public static void main(String []a){

        Student std1 = new Student(80);
        Student std2 = new Student(90);

        Student std3 = std1;

        System.out.println("----Values-----");
        System.out.println("Student 1 Marks : "+std1.marks);
        System.out.println("Student 2 Marks : "+std2.marks);
        System.out.println("Student 3 Marks : "+std3.marks);

        System.out.println("----Memory References----");
        System.out.println("Std1 Reference : "+std1);
        System.out.println("Std2 Reference : "+std2);
        System.out.println("Std3 Reference : "+std3);


    }
}