public class leap
{
     public static void main (String[]args){
        int y=2024;
        if(y % 400==0 || y % 4 == 0 && y % 100 !=0)
            System.out.println(y+ " is leap year");
        else
              System.out.println(y+ " is not aleap year") ;
     }
}