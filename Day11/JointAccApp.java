class BankAccount
{
    private int balance = 100;

    public synchronized void withdraw(int amount, String name)
    {
        System.out.println(name + " is checking the balance...(current bal "+balance+")");
        if (balance >= amount) 
        {
            System.out.println(name+" is withdrawing "+amount);
            balance -= amount;
            System.out.println(name+ " completed withdrawal.Remaining Bal:"+balance);
            
        }
        else
        {
            System.out.println("Sorry "+name+" insufficient funds for "+amount);
        }
        System.out.println("---------------------------");
    }
}
public class JointAccApp 
{
    public static void main(String[]a)
    {
        BankAccount acc = new BankAccount();

        //Two users trying to access the same account
        Thread user1 = new Thread(()->acc.withdraw(70,"User-A"));
        Thread user2 = new Thread(()->acc.withdraw(70, "User-B"));

        user1.start();
        user2.start();
    }    
}
