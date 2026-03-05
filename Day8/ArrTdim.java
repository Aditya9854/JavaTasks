
public class ArrTdim 
{
    public static void main(String[] a) 
    {
        //3 students(rows),4 subjects(col)
        int[][] grades = {
            {85,90,76,90},
            {88,67,78,92},
            {60,84,91,79}
        };    

        //Accessing student 1's 3rd sub grade
        System.out.println("Student 1 subject 3 grade :"+grades[1][2]);

        //calculating avg for student 0
        int total = 0;
        for(int score : grades[0])
        {
            total += score;
        }
        System.out.println("Student 0 average : "+(total /4.0));
    }    
}
