import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,s=0;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            s=a+s*10;
        }
        System.out.println("the reverse of given number = " + s);
        sc.close();
    }
    
}
