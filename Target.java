import java.util.Scanner;
public class target{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        int p1,p2,p3,p4;
        p1=a.nextInt();
        p2=a.nextInt();
        p3=a.nextInt();
        p4=a.nextInt();
        if(p1>=10 && p2>=10 && p3>=10 && p4>=10)
        {
            System.out.printf("YES");
        }
        else
        {
            System.out.printf("NO");
        }
    }
}