public class prime
{
    public static void main (String[]args)
   {
    int i,flag=0;
    int n=5;
    if(n<2)
    System.out.println("not a prime no.");
    else{
        for(i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.println("not a prime no.");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("is a prime no.");
        }
    }
   }
}