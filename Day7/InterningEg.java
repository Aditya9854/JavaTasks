public class InterningEg
{
    public static void main(String []a)
    {
        String result1 = new String("Pass");
        String result2 = new String("Pass");

        System.out.println("Before Interning : "+ (result1 == result2)); //false :caus they are diff objs in heap
        
        String interned1 = result1.intern();
        String interned2 = result2.intern();

        System.out.println("After interned : "+ (interned1 == interned2)); // true :caus now they point to exact same memory loc.
    }
}