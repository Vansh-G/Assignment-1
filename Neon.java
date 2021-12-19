import java.util.Scanner;
class Neon
{
    public static void main(String[] args)
    {
        System.out.println("Please enter a number");
        int num,a,b,c,sum=0;

        Scanner scan=new Scanner(System.in);
        num= scan.nextInt();
        a=num;
        b=a*a;

        while(b>0)
        {
            c=b%10;
            sum=sum+c;
            b=b/10;
        }

        if(sum==num)
        {
            System.out.println("It is a Neon number");
        }

        else
        {
            System.out.println("It is not a neon number");
        }
    }
}
