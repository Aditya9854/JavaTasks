public class PassbyValue
{
    //copy of iNo is passed to iValue ie. original value of iNo does't change
    public static void modifyNum(int iValue)
    {
        iValue = iValue * 2;
        System.out.println("modified : "+iValue);
    }

    public static void main(String[] a)
    {
        int iNo = 10;

        System.out.println("Before : "+iNo);//10
        modifyNum(iNo);//20
        System.out.println("After : "+iNo);//10

    }
    
}
