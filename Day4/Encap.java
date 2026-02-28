//Encapsulation example --declaring variable as private 
 //                     --Accessing/updating it with public get set methods 
class GetInfo 
{
    private String name;

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
  
}
public class Encap 
{
   public static void main(String[]a)
   {
        GetInfo obj = new GetInfo();

        obj.setName("amit");
        System.out.println(obj.getName());
   }
    
}
