import java.util.Scanner;
public class dayy{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n==1)
        {
            System.out.printf("Monday");
        }
        else if(n==2)
        {
            System.out.printf("Tuesday");
        }
        else if(n==3)
        {
            System.out.printf("Wednesday");
        }
        else if(n==4)
        {
            System.out.printf("Thursday");
        }
        else if(n==5)
        {
            System.out.printf("Friday");
        }
        else if(n==6)
        {
            System.out.printf("Saturday");
        }
        else if(n==7)
        {
            System.out.printf("Sunday");
        }
        else
        {
            System.out.printf("Invalid input");
        }
    }
}