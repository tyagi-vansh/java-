import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f=1;
        for(int i=n;i>0;i--)
        {
            f=f*i;
        }
        System.out.println("factorial of given numer = " + f);
        sc.close();
    }
    
}
