import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the year");
        int y = scanner.nextInt();
        if ((y % 4 == 0) && (y % 400 == 0)) {
            System.out.println("the entered year is a leap year");
        } else {
            if (y % 100 == 0) {
                if (y % 400 == 0) {
                    System.out.println("the entered year is a leap year");
                }

                else {
                    System.out.println("the entered year is not a leap year");
                }
            }
        }
        scanner.close();
    }
}
