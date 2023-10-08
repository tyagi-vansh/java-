import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=n,a=0,s=0;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            s=a+s*10;
        }
        if(s==m)
        {
            System.out.println("palindrome no");
        }
        else{
            System.out.println("not a palindrome");
        }
        sc.close();
    }
    
}
