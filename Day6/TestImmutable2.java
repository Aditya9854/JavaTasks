
final class Transaction 
{
    private final String id;
    private final double amount;
    private final String status;

    public Transaction(String id, double amount, String status)
    {
        this.id = id;
        this.amount = amount;
        this.status = status;
    }
    
    //Getters
    public String getId()
    {
        return id;
    }
    public double getAmount()
    {
        return amount;
    }
    public String getStatus()
    {
        return status;
    }
    public Transaction withStatus( String newStatus)
    {
        return new Transaction(this.id, this.amount, newStatus);
    }
}
public class TestImmutable2 
{
    public static void main(String []a)
    {
        Transaction t1 = new Transaction("bnk101",5000.00,"PENDING");

        Transaction t2 = t1.withStatus("Complete");

        System.out.println("Original Record : "+t1.getStatus());
        System.out.println("Updated Record : "+t2.getStatus());
    }
}
