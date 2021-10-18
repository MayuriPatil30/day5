import java.util.Scanner;
public class Largest
{
        public static void main(String[] args) 
        {
           int a,b,c, d;
           Scanner x = new Scanner(System.in);

           System.out.println(" Enter First Number : ");
           a = x.nextInt();
           Scanner y = new Scanner(System.in);

           System.out.println(" Enter Second Number : ");
           b = y.nextInt();
           Scanner z = new Scanner(System.in);

           System.out.println(" Enter Third Number : ");
           c = z.nextInt();

          if( a >= b && a >= c)
          System.out.println(a+" is the largest Number");

           else if (b >= a && b >= c)
           System.out.println(b+" is the largest Number");

          else
          System.out.println(c+" is the largest Number");

        
    }
}