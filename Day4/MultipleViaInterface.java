interface Camera  
{
    void takePhoto();
}
interface Phone
{
    void makeCall();
}
class SmartPhone implements Camera,Phone
{
    public void takePhoto()
    {
        System.out.println("Capturing photo...");
    }
    public void makeCall()
    {
        System.out.println("dialing number");
    }
}

public class MultipleViaInterface {
    public static void main(String []a)
    {
        SmartPhone myPhone = new SmartPhone();

        myPhone.takePhoto();
        myPhone.makeCall();
    }
}
