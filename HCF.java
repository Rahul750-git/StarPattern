import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        int n,d,r;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number and divider");
        n= sc.nextInt();
        d= sc.nextInt();
        do {
            r=n%d;
            if (r!=0){
                n=d;
                d=r;

            }else
                break;
        }while (true);
        System.out.println("HCF ="+d);
    }
}
