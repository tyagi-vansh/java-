import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.sunday");
        System.out.println("2.monday");
        System.out.println("3.tuesday");
        System.out.println("4.wednesday");
        System.out.println("5.thursday");
        System.out.println("6.friday");
        System.out.println("7.saturday");
        int n = sc.nextInt();

        switch (n) {
            case 1: {
                System.out.println("oh shit its weekend");
                break;
            }
            case 2: {
                System.out.println("hurah !!!!!!!!its weekday");
                break;
            }
            
            case 3: {
                System.out.println("hurah!!!!!!!! its weekday");
                break;
            }
            
            case 4: {
                System.out.println("hurah !!!!!!!!its weekday");
                break;
            }
            case 5: {
                System.out.println("hurah !!!!!!!!its weekday");
                break;
            }
            case 6: {
                System.out.println("hurah !!!!!!!!its weekday");
                break;
            }
            case 7: {
                System.out.println("oh shit its weekend");              
              break;
            }
            default: {
                System.out.println("invalid choice");
            }
        }
        sc.close();
    }
}
