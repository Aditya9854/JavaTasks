interface Notification
{
    void notifyUser();
}
class SMSNotification implements Notification
{
    public void notifyUser()
    {
        System.out.println("Sending an SMS notification...");
    }
}
class EmailNotification implements Notification
{
    public void notifyUser()
    {
        System.out.println("Sending Email notification...");
    }
}
class WhatsappNotification implements Notification
{
    public void notifyUser()
    {
        System.out.println("Sending Whatsapp notification...");
    }
}
class NotificationFactory
{
    //method to decide which obj to create based on string op
    public Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty()) 
        {
            return null;    
        }

        return switch(channel.toUpperCase()){

            case "SMS" -> new SMSNotification();
            case "EMAIL" -> new EmailNotification();
            case "WHATSAPP" -> new WhatsappNotification();
            default -> throw new IllegalArgumentException("Unknown channel : "+channel); 
        };
    }
}

public class FactoryPattern 
{
    public static void main(String[] a) 
    {
        NotificationFactory factory = new NotificationFactory();

        Notification n1 = factory.createNotification("EMAIL");
        n1.notifyUser();

        Notification n2 = factory.createNotification("SMS");
        n2.notifyUser();

        Notification n3 = factory.createNotification("WHATSAPP");
        n3.notifyUser();

        try
        {
            factory.createNotification("RANDOM_MSG");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Error: "+e.getMessage());
        }
    }    
}
