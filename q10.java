import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("1.januray");
        System.out.println("2.feburary");
        System.out.println("3.march");
        System.out.println("4.april");
        System.out.println("5.May");
        System.out.println("6.june");
        System.out.println("7.july");
        System.out.println("8.august")
        ;System.out.println("9.september");
        System.out.println("10.october");
        System.out.println("11.november");
        System.out.println("12.december");
        int n = sc.nextInt();

        switch (n) {
            case 1: {
                System.out.println("winter");
                break;
            }
            case 2: {
                System.out.println("winter");
                break;
            }
            
            case 3: {
                System.out.println("winter");
                break;
            }
            
            case 4: {
                System.out.println("summer/pre monsoon");
                break;
            }
            case 5: {
                System.out.println("summer/pre monsoon");
                break;
            }
            case 6: {
                System.out.println("monsoon");
                break;
            }
            case 7: {
                System.out.println("monsoon");              
              break;
            }
            case 8: {
                System.out.println("monsoon");              
              break;
            }
            case 9: {
                System.out.println("monsoon");              
              break;
            }
            case 10: {
                System.out.println("post monsoon");              
              break;
            }
            case 11: {
                System.out.println("post monsoon");              
              break;
            }
            case 12: {
                System.out.println("winter");              
              break;
            }
            default: {
                System.out.println("invalid choice");
            }
        }
        sc.close();
    }
    
}
