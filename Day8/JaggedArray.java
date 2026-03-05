public class JaggedArray 
{
    public static void main(String[] a) 
    {
        //record of runner runs each day
        int[][] kms = new int[3][];

        kms[0] = new int[]{5,3,7}; //week 1: 3days
        kms[1] = new int[]{9,8,5,3,2,5}; //week 2: 6 days
        kms[2] = new int[]{10,11}; //week 3: 2 days

        for(int i = 0; i < kms.length; i++)
        {
            System.out.println("Week "+(i+1)+" log length :"+kms[i].length);
        }
    }
}
