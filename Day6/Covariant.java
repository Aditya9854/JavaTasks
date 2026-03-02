class Gift
{
    void uwrap()
    {
        System.out.println("Unwrapping gift..");
    }
}
class Toy extends Gift
{
    void unwrap()
    {
        System.out.println("Unwrapping new marvel toy!");
    }
    void play()
    {
        System.out.println("Playing with  toy");
    }
}
class Store
{
    Gift geGift()
    {
        return new Gift();
    }
}
class ToyStore extends Store
{
    Toy getGift()
    {
        return new Toy();
    }
}
public class Covariant
{
    public static void main(String []a)
    {
        ToyStore tStore = new ToyStore();

        Toy mToy = tStore.getGift();

        mToy.unwrap();
        mToy.play();
    }
}