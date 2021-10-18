import java.util.Scanner;

public class Swapnumber 
{
    public static void main(String[] args)
     {
        int num1, num2;
        System.out.println("      Enter Your Choice of number     ");
        Scanner x = new Scanner(System.in);

        System.out.println("Enter first number : ");
        num1 = x.nextInt();
        Scanner y = new Scanner(System.in);

        System.out.println("Enter second number : ");
        num2 = y.nextInt();
        System.out.println("AFTER SWAP YOUR First Number is : " +num2+"  &  Second Number is : " +num1);

    }
}