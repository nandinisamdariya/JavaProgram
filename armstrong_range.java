import java.util.Scanner;

public class armstrong_range
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter ther upper & lower range:");
        int l=scanner.nextInt();
        int h=scanner.nextInt();

        System.out.println("Armstrong no. btw" + l + "and" + h + "are");

        for(int num = l; num<=h; num++){
            int res=0 , temp ,  digit ,len ;

            len = getArm(num);
            temp = num;

            while(temp!=0){
                digit = temp % 10;
                res += (int)Math.pow(digit ,len);
                temp/=10;
            };
             if(res == num)
                System.out.println(num + " ");
        }
    }

private static int getArm(int num){
    int len =0;
    while(num!=0){
        len ++;
        num = num/10;
    }
     
     return len;
}
}