import java.util.Scanner;
class armstrong
{
    public static void main(String[] args)
    {
        System.out.println("Enter a Number");
        int n;
        int r;
        int temp;
        int total=0;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        System.out.println("Your number is "+ n);
        r=n;

        while(r>0)
        {

            temp=r%10;
            total=total+(temp*temp*temp);
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
