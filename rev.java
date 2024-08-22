public class rev
{
  public static void main (String[]args)
  {
    int num = 2345 , rev =0 ,rem;

    while(num!=0){
        rem = num%10;
        rev = rev * 10 + rem;
        num /= 10;
    };

    System.out.println("reversed no.:"+ rev);
  }
}