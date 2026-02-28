// final class cannot be inherited
final class Encrypter 
{
    void setPass(String pass)
    {
        System.out.println("Encrypting Password...");
    }
    
}
public class UseOfFinal3
{
    public static void main(String[]a)
    {
        Encrypter eObj = new Encrypter();
        eObj.setPass("ap@321");
    }  
}
