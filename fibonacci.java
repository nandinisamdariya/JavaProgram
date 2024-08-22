public class fibonacci
{
    public static void main(String args [])
    {
        int num = 5;
        int a = 0 , b = 1; 

        System.out.print(a + "," + b + ",");

        int term;
        for(int i =2 ; i< num ; i ++){
            term = a + b;
            a=b;
                b=term;
                System.out.print(term + ",");

        }
    }
}