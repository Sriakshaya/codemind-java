import java.util.Scanner;
public class wei{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if(a%2!=0)
        {
            System.out.printf("weird");
        }
        else if(a%2==0 && 6<=a && a<=20)
        {
            System.out.printf("weird");
        }
        else
        {
            System.out.printf("not weird");
        }
   }
}