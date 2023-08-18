import java.util.Scanner;
public class con{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x,a,b;
        x = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        if(x<=a+b*2)
        {
            System.out.printf("Qualify");
        }
        else
        {
            System.out.printf("Not Qualify");
        }
    }
}