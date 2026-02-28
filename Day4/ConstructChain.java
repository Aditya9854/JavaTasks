public class ConstructChain
{
    int iNo1,iNo2;

    ConstructChain(int iNum)
    {
        this(2,iNum);
    }

    ConstructChain(int iNo1, int iNo2)
    {
        this.iNo1 = iNo1;
        this.iNo2 = iNo2;
    }

    int MultDisplay()
    {
        return iNo1 * iNo2;
    }
    public static void main(String[]a)
    {
        ConstructChain cObj = new ConstructChain(12);
        ConstructChain cObj2 = new ConstructChain(12, 5);

        System.out.println(cObj.MultDisplay());
        System.out.println(cObj2.MultDisplay());

    }
    
}
