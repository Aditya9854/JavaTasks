class Bank
{
    double rateOfInterest()
    {
        return 0;
    }
}
class SBIBank extends Bank 
{
    double rateOfInterest()
    {
        return 7.5;
    }
}
class ICICBank extends Bank
{
    double rateOfInterest()
    {
        return 8.5;
    }
}

public class Overriding 
{
    public static void main(String[]a)
    {
        Bank bObj;

        bObj = new SBIBank();
        System.out.println("SBI Interest : "+bObj.rateOfInterest());

        bObj = new ICICBank();
        System.out.println("ICIC Interest : "+bObj.rateOfInterest());
    }
}
