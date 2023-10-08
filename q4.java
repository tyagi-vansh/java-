import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("enter the choice 1.celcius to farenheit 2. farenheit to celcius");
        int y = scanner.nextInt();
       if(y==1)
       {
        double c = scanner.nextFloat();
        System.out.println((c*9/5)+32);
       }
       else{
        double f = scanner.nextFloat();
        System.out.println((f-32)*5/9);
       }
       scanner.close();
    }
    
}
