import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
        int x,y;
        Scanner sc =new Scanner(System.in);
        x= sc.nextInt();
        y= sc.nextInt();
        int p=1;
        while (y>=1){
            p=p*x;
            y=y-1;
        }
        System.out.println(p);

    }
}
