class Patient
{
    void register()
    {
        System.out.println("Patient registered at front desk.");
    }
}
class HeartPatient extends Patient
{
    void heartCheckup()
    {
        System.out.println("Performing heartcheckup..");
    }
}
public class DwnCast 
{
    public static void main(String []a)
    {
        //upcasting 
        Patient p = new HeartPatient();
        p.register();

        //downcasting
        if (p instanceof HeartPatient) 
        {
            HeartPatient hp =  (HeartPatient) p;
            hp.heartCheckup();   
        }
    }   
}
