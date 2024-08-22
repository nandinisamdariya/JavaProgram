public class prime_range
{
    public static void main (String[]args)
   {
    int a=4 ,b =6;
    
    for(int i = a; i<=b;i++)
        if(isprime(i))
        System.out.println(i);
    }

    static boolean isprime(int n){
     
    if(n<2)
    return false;

    for(int i=2;i<=n/2;i++){
            if(n%i==0)
            return false;
            
    }
       return true;
    }
   }


