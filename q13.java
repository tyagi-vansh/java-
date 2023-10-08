import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int c=0;
        int n = sc.nextInt();
        while(n>0)
        {
            c++;
            n=n/10;
        }
        System.out.println("numer of digits in given number ="+c);
        sc.close();
    }
    
}
