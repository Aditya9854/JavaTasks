/*
    Create a program that demonstrates primitive vs reference types.
 */
class Student{
    int grade;
}
 class PrimitiveVsRef {
    
    public static void main(String [] a){
        //Primitive type
        int OgScore = 80;
        int CpyScore = OgScore;

        CpyScore = 95;   //will not effect Original

        System.out.println("----Primitives.-----");
        System.out.println("Original Score : "+OgScore);
        System.out.println("Copy Score : "+CpyScore);

        //Reference Type

        Student std1 = new Student();
        std1.grade = 80;

        Student std2 = std1;

        std2.grade = 95; //it will change std1 grade as well

        System.out.println("---Reference Type----");
        System.out.println("Student 1 Grade : "+std1.grade);
        System.out.println("Student 2 Grade : "+std2.grade);


    }
}
