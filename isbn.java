import java.util.Scanner;
class isbn
{
        public static void main(String[] args)
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter your ISBN number");
            Long isbn = scan.nextLong();
            long a,b,c=1,sum=0;
            int length = String.valueOf(isbn).length();

            if(length!=10)
            {
                System.out.println("Illegal ISBN");
            }

            else
            {
                while(c<11)
                {
                    a= isbn%10;

                    b= a*c;

                    sum=sum+b;

                    c++;

                    isbn=isbn/10;
                }

                if(sum%11==0)
                {
                    System.out.println("This is an ISBN number");
                }

                else
                {
                    System.out.println("Illegal ISBN");
                }



            }

        }
}
