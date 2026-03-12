class Box<T>
{
    T value;
    
    void setValue(T value)
    {
        this.value = value;
    }
    T getValue()
    {
        return value;
    }
}
public class GenClass 
{
    public static void main(String[] a) 
    {
        Box<Integer> b = new Box<>();
        b.setValue(10);
        System.out.println(b.getValue());
    }    
}
