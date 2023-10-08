import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the salary");
        double y = scanner.nextDouble();
        if(y<=10000)
        {
            System.out.println("no tax applicable");
        }
        if(y>10000 && y<20000)
        {
            double a=y*0.1;
            System.out.println("tax applicable="+ a);
        }
        
        if(y>20000 && y<30000)
        {
            double a=y*0.2;
            System.out.println("tax applicable="+ a);
        }
        
        if(y>30000)
        {
            double a=y*0.25;
            System.out.println("tax applicable="+ a);
        }
        scanner.close();
    }
}
