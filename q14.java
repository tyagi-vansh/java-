import java.util.Scanner;

public class q14 {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int c=0,s=0;
        int n = sc.nextInt();
        while(n>0)
        {
            c=n%10;
            n=n/10;
            s=s+c;
        }
        System.out.println("sum of digits in given number ="+ s);
        sc.close();
    }
    
}
