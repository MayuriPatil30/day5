import java.util.Scanner;

public class Evenorodd
{
      public static void main(String[] args)
     {
          int num;
          Scanner x = new Scanner(System.in);
          System.out.println("Enter the Number : ");
          num = x.nextInt();
          if (num%2 == 0)
         {
            System.out.println("Given Number is Even :" + num);
         } else 
         {
           System.out.println("Given Number is Odd :" + num );
         }
      }
}