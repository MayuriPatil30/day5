import java.util.Scanner;
class Harmonic
{
    public static void main(String arg[])
    {
        double n,i;
        double sum=0;

        Scanner x=new Scanner(System.in);
        System.out.println("Enter a Number");
        n= x.nextDouble();

        for( i=1;i<=n;i++)
        {
            sum=sum+(1/i);
        }
        System.out.println("Harmonic value = "+sum);
     }
}