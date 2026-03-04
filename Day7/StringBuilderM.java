public class StringBuilderM 
{
    public static void main(String[]a)
    {
        //Initialize
        StringBuilder sb = new StringBuilder("Java-Programming");

        //append()
        sb.append("-2026");
        System.out.println("After Append : "+sb); //Java-Programming-2026

        //insert() -Adds at specific loc
        sb.insert(0, "Tutorial-"); 
        System.out.println("After Insert : "+sb); //Tutorial-Java-Programming-2026

        //replace() - swaps range of characters
        sb.replace(9, 13, "Python");
        System.out.println("After Replace : "+sb);  //Tutorial-Python-Programming-2026

        //delete()
        sb.delete(0, 9);
        System.out.println("After Delete : "+sb); //Python-Programming-2026

        //capacity() vs length()
        System.out.println("Final Length : "+sb.length());  //counts characters
        System.out.println("Current Capacity : "+sb.capacity());   //total allocated memory
 
    }
    
}
