public class WhileLoop 
{
    public static void main(String[] a)
    {
        double[] prices = {19.99,25.50,9.90};
        int i = 0;

        while (i < prices.length) 
        {
            System.out.println("Price : "+prices[i]);
            i++;    
        }
    }
}
