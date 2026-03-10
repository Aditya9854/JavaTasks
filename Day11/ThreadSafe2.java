class Inventory 
{
    private int stockCnt = 500;

    public synchronized void reduceStock(int amt)
    {
        if(stockCnt >= amt)
        {
            stockCnt -= amt;
            System.out.println(Thread.currentThread().getName()+"Updated Stock to: "+stockCnt);
        }
    }
    public synchronized int getStockCnt()
    {
        return stockCnt;
    }
    
}
public class ThreadSafe2 
{
    public static void main(String[] a) 
    {
        Inventory iObj = new Inventory();

        //5 diff customers (threads) trying to buy 120 items each
        //requested = 600  available = 500
        for(int i =1; i <= 5; i++)
        {
            new Thread(()->{
                iObj.reduceStock(120);
            },"customer: "+i).start();
        }

    }    
}
