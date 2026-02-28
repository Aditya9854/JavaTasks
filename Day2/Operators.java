
public class Operators {

    public static void main(String []a)
    {
        int iNo1 = 46;
        int iNo2 = 15;

        //Arithmetic Operators
        System.out.println(iNo1 + iNo2);
        System.out.println(iNo1 - iNo2);
        System.out.println(iNo1 * iNo2);
        System.out.println(iNo1 / iNo2);
        System.out.println(iNo1 % iNo2);

        int iNo3 = 15;

        iNo3++;
        System.out.println(iNo3);
        --iNo3;
        System.out.println(iNo3);


        //Relational Operator
        System.out.println(iNo1 == iNo2); //false
        System.out.println(iNo1 != iNo2); //true
        System.out.println(iNo1 > iNo2); //true
        System.out.println(iNo1 < iNo2); //false
        System.out.println(iNo1 >= iNo2); //true
        System.out.println(iNo1 <= iNo2); //false

        //Logical Operator

        boolean isLoggedIn = true;
        boolean  isAdmin = false;

        System.out.println("Regular User: "+(isLoggedIn && !isAdmin));
        System.out.println("Has Access: "+(isLoggedIn || isAdmin));
        System.out.println("Not LoggedIn:"+(!isLoggedIn));

    }

}
