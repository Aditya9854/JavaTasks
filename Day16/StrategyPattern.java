
interface PaymentStrategy
{
    void pay(int amount);
}

class CreditCardStrategy implements PaymentStrategy
{
    private String name;
    private String cardNo;

    public CreditCardStrategy(String name, String cardNo)
    {
        this.name = name;
        this.cardNo = cardNo;
    }
    public void pay(int amount)
    {
        System.out.println(amount + " paid with credit card ["+cardNo+"]");
    }
}
class GpayStrategy implements PaymentStrategy
{
    private String MNo;

    public GpayStrategy(String MNo)
    {
        this.MNo = MNo;
    }

    public void pay(int amount)
    {
        System.out.println(amount+ " paid using Gpay Mobile no : "+MNo);
    }
}
class ShoppingCart
{
    private int amount = 0;

    public void addAmount(int price)
    {
        this.amount += price;
    }
    public void checkout(PaymentStrategy paymentMethod)
    {
        paymentMethod.pay(amount);
    }
}
public class StrategyPattern 
{
    public static void main(String[] a)
    {
        ShoppingCart cart = new ShoppingCart();

        cart.addAmount(500);
        cart.addAmount(200);

        System.out.println("------Gpay payment-------");
        cart.checkout(new GpayStrategy("9878987665"));

        System.out.println("-----Credit Card payment------");
        cart.checkout(new CreditCardStrategy("axzz", "123-233-7761"));
    }    
}
