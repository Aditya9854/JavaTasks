class ProductSearch 
{
    //Method Overloading 
    void search(String name)
    {
        System.out.println("Searching for product name : "+name);
    }
    void search(int productId)
    {
        System.out.println("Searching product for id :"+productId);
    }
    void search(double minPrice,double maxPrice)
    {
        System.out.println("Filtering products with price range between : "+minPrice+" and "+maxPrice);
    }
    
}
public class TestOverload 
{
    public static void main(String[]a)
    {
        ProductSearch ps = new ProductSearch();

        ps.search("Laptop");
        ps.search(1001);
        ps.search(40000, 70000);
    }   
}