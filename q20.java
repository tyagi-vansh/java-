import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0,c=1,a=0;
        System.out.println("series = ");
        for(int i=0;i<n;i++)
        {
            a=s+c;
            s=c;
            c=a;
            System.out.print(c);
        }
        sc.close();
    }
    
}
