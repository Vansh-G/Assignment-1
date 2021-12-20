import java.util.Scanner;
class armstrong
{
    public static void main(String[] args)
    {
        System.out.println("Enter a Number");
        int n;
        int r;
        int temp;
        double total=0;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        System.out.println("Your number is "+ n);
        int l=String.valueOf(n).length();
        r=n;

        while(r>0)
        {

            temp=r%10;
            total=total+Math.pow(temp,l);
            r=r/10;

        }
        if(total==n)
        {
            System.out.println("This is an Armstrong Number");
        }

        else
        {
            System.out.println("This is not an Armstrong number");
        }

    }
}
