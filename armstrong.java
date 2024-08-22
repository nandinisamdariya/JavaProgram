public class armstrong
{
  public static void main (String[]args)
  {
    int num = 153 ,temp, res =0 ,rem;
    temp = num;
    while(temp!=0){
        rem = temp%10;
        res+= Math.pow(rem ,3);
        temp /= 10;
    }
    if(res==num)
    System.out.println(num + " is armstrong no.");
    else
    System.out.println(num + " is not a armstrong no.");
  }
  }
