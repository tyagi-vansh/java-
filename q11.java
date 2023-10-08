import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Red");
        System.out.println("2.Yellow");
        System.out.println("Green");
        int n = sc.nextInt();
        switch(n)
        {
            case 1:{
                System.out.println("red");
                break;
            }
            case 2:
            {
                System.out.println("yellow");
                break;
            }
            case 3:
            {
                System.out.println("green");
                break;
            }
            default: {
                System.out.println("invalid input");
            }
        }
        sc.close();
    }
    
}
