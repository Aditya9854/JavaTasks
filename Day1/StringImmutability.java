/*

Demonstrate String immutability using concatenation vs StringBuilder

*/

public class StringImmutability{

    public static void main(String [] a){
       
        //Concatenation
        String str = "Hello";
        String ogStringRef = str;

        str = str + " World"; //creates separate obj

        System.out.println( "----String Immutability------");
        System.out.println("Current String : "+str);
        System.out.println("Same object as before ? : "+ (str == ogStringRef));

        //StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder ogSbRef = sb;

        sb.append(" World"); //Modifies the object

        System.out.println( "----String Mutability------");
        System.out.println("Current SB : "+sb.toString());
        System.out.println("Same object as before ? : "+ (sb == ogSbRef));


    }
}