class Search
{
    // Search class can be inherited but final method cannot be overriden
    final void showResult()
    {
        System.out.println("Displaying Search Result..");
    }
}
class CustomSearch extends Search
{
    //void showResult(){}     //error
}
public class UseOfFinal2
{
    public static void main()
    {
        CustomSearch cObj = new CustomSearch();
        cObj.showResult();
    }
}