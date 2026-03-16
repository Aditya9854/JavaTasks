import java.util.ArrayList;
import java.util.List;

interface Observer
{
    void update(String stockName, double price);
}
interface Subject
{
    void registerObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObservers();
}
class Stock implements Subject
{
    private List<Observer> observers = new ArrayList<>();
    private String name;
    private double price;

    public Stock(String name,double price)
    {
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price)
    {
        this.price = price;
        notifyObservers();
    }
    public void registerObserver(Observer obs)
    {
        observers.add(obs);
    }
    public void removeObserver(Observer obs)
    {
        observers.remove(obs);
    }
    public void notifyObservers()
    {
        for(Observer obs: observers)
        {
            obs.update(name, price);
        }
    }
}
class MobileAppUser implements Observer
{
    private String username;

    public MobileAppUser(String name)
    {
        this.username = name;
    }
    public void update(String stockName, double price)
    {
        System.out.println("Notification to ["+username+"]"+ stockName +" price is now : "+price);
    }
}
public class ObserverPattern 
{
    public static void main(String[] a)
    {
        Stock appleStock = new Stock("Apple(AAPL)", 150);

        //create observers
        MobileAppUser user1 = new MobileAppUser("Ajy");
        MobileAppUser user2 = new MobileAppUser("axar");

        //register Observers
        appleStock.registerObserver(user1);
        appleStock.registerObserver(user2);

        //change price -both user will be notified
        System.out.println("---Price change 1----");
        appleStock.setPrice(2000);
        
        //user decides to be removed
        appleStock.removeObserver(user2);

        System.out.println("-----Price change 2-----");
        appleStock.setPrice(160);
    }    
}
