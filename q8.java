import java.util.Scanner;

public class q8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your acount number");
        int ac = sc.nextInt();
        if (ac == 123) {
            int p = 5000;
            System.out.println("1.deposit");
            System.out.println("2.withdraw");
            System.out.println("3.check balance");
            int n = sc.nextInt();

            switch (n) {
                case 1: {
                    System.out.println("enter the amount tobe deposoited");
                    int a = sc.nextInt();
                    System.out.println("total balance in your account = " + (a + p));
                    break;
                }
                case 2: {
                    System.out.println("enter the amount to be withdraw");
                    int a = sc.nextInt();
                    System.out.println("total balance left in account = " + (a - p));
                    break;
                }
                case 3: {
                    System.out.println(" total balance in your account = " + (p));
                    break;
                }
                default: {
                    System.out.println("invalid choice");
                }
            }
        }
        sc.close();
    }
}
