import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.addition");
        System.out.println("2.subtraction");
        System.out.println("3.division");
        System.out.println("4.multiplication");
        int n = sc.nextInt();
        switch (n) {
            case 1: {
                System.out.println("enter the first number");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("the addition of given two numbers = " + (a + b));
                break;
            }
            case 2: {
                System.out.println("enter the first number");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("the subtraction of given two numbers = " + (a - b));
                break;
            }
            case 3: {
                System.out.println("enter the first number");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("the division of given two numbers = " + (a / b));
                break;
            }
            case 4: {
                System.out.println("enter the first number");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("the multiplication of given two numbers = " + (a * b));
                break;
            }
            default: 
            {
                System.out.println("invalid choice");
            }
        }
        sc.close();
    }
}
