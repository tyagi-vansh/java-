import java.util.Scanner;

public class Salary {
    static double hra(double salary){
        double ha=salary*0.3;
        return ha;
    }
    static double da(double salary){
        double d=salary*0.2;
        return d;
    }
    static double ta(double salary){
        double t=salary*0.1;
        return t;
    }
    static double net_Salary(double salary){
        double pf=1400;
        double netsal=salary+hra(salary)+da(salary)+ta(salary)-pf;
        return netsal;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE SALARY OF AN EMPLOYEE: ");
        double salary=s.nextDouble();
        System.out.println("THE NET_SALARY OF AN EMPLOYEE : "+net_Salary(salary));
        s.close();
    }
}