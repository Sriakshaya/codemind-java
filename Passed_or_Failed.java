import java.util.Scanner;
public class pass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int en,ma,phy,che,cs;
        en = sc.nextInt();
        ma = sc.nextInt();
        phy = sc.nextInt();
        che = sc.nextInt();
        cs = sc .nextInt();
        if(en>=34 && ma>=34 && phy>=34 && che>=34 && cs>=34)
        {
            System.out.printf("PASSED");
        }
        else
        {
            System.out.printf("FAILED");
        }
    }
}