import java.util.Scanner;

public class pattern10 {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the size of pattern");
            int n = s.nextInt();
            for (int i = 0; i <=n; i++) {
                for (int j = 0; j<=n; j++) {
                    if (i == n / 2 || j == n / 2) {
                        System.out.print("+");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            s.close();
        }
    
    }