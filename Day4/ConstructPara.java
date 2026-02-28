public class ConstructPara
{
    int id;
    String name;
    
    //parameterized constructor
    ConstructPara(int i,String n)
    {
        id = i;
        name = n;
    }

    public static void main(String[]a)
    {
        ConstructPara cObj = new ConstructPara(1, "ganesh");

        System.out.print(cObj.id+" | "+cObj.name);
    }

    
}
