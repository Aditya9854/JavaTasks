final class Immutable
{
    private final int x;
    private final int y;

    public Immutable(int x,int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
}
public class TestImmutable 
{
    public static void main(String []a)
    {
        Immutable iObj = new Immutable(10,14);

        System.out.println("X : "+iObj.getX());
        System.out.println("Y : "+iObj.getY());

    }
}
