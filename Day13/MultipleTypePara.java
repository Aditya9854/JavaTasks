class Pair<K,V>
{
    K key;
    V value;

    Pair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }
    void display()
    {
        System.out.println(key+" : "+value);
    }
}
public class MultipleTypePara 
{
    public static void main(String[] a) 
    {
        Pair<Integer,String> p = new Pair<>(1, "java");
        p.display(); 
    }    
}
