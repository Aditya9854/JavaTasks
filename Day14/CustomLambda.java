//Custom functional interface
interface StringTransformer
{
    String transform(String input);
}

public class CustomLambda 
{
    public static void main(String[] a)
    {
        //implementing interface using lambda exp
        StringTransformer upperCaseTrans = (s) -> s.toUpperCase();

        StringTransformer bracketTrans = (s) -> "["+ s +"]";

        //passing lambdas as method parameters
        System.out.println("Result1 : "+processString("test1", upperCaseTrans));
        System.out.println("Result1 : "+processString("test2", bracketTrans));


    }   
    public static String processString(String text, StringTransformer transformer)
    {
        return transformer.transform(text);
    } 
}
