import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range");
        int n =sc.nextInt();
        int m = sc.nextInt();
        System.out.println("even numbers are");
        for(int i=n;i<m;i++)
        {
            if(i%2==0)
            {
                System.out.print(i);
            }
        }
        sc.close();
    }
    
}
