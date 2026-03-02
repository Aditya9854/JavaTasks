//Use private access modifier to implement data hiding 
//Ensuring internal data cannot be accessed by other class 
class Bank
{
    private int pin = 1941;
    private double balance = 5000.00;

    public void checkBalance(int enteredPin)
    {
        if (enteredPin == this.pin) 
        {
            System.out.println("Balance : "+balance);
        }
        else
        {
            System.out.println("Incorrect PIN");
        }
    }
}
public class DataHide 
{
    public static void main(String []a)
    {
        Bank bObj = new Bank();

        bObj.checkBalance(1941);
    }
    
}
