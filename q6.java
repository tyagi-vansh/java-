import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        if(p>1000 && p<5000)
        {
            System.out.println("net bill = "+ p);
            System.out.println("discount = 5%");
            System.out.println("total amount to be paid =" +(p-(p*0.05)));
        }
        else if(p>5000 && p<10000)
        {
            System.out.println("net bill = "+ p);
            System.out.println("discount = 10%");
            System.out.println("total amount to be paid =" +(p*0.1));
        }
        else if(p>10000 && p<20000)
        {
            System.out.println("net bill = "+ p);
            System.out.println("discount = 15%");
            System.out.println("total amount to be paid =" +(p*0.15));
        }
        else if(p>20000)
        {
            System.out.println("net bill = "+ p);
            System.out.println("discount = 25%");
            System.out.println("total amount to be paid =" +(p*0.25));
        }
        else{
            System.out.println("net bill =" +p);
            System.out.println("discount = 0%");
            System.out.println("total amount to be paid ="+ p);
        }
        sc.close();
    }
    
}
