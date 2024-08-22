public class sum_digit
{
    public static void main(String args[]){
        int num = 6781;
            System.out.println("sum of digit:" +getsum(num));
    }
     static int getsum(int num){
        if (num==0)
        return 0;

        return(num%10)+ getsum(num/10);
     }
}