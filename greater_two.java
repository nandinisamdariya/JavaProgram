public class greater_two {
    public static void main(String args[])
    {
        int num1 = 2, num2 = 7;
        if (num1 == num2)
            System.out.println("both are equal");
        else
            // prints the maximum of two numbers
            System.out.println(Math.max(num1, num2) + " is greater");
    }
}