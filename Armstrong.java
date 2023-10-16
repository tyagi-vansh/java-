import java.util.Scanner;
public class Function {
    // Function to calculate x raised to the power y
    static int power(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
    static int cnt(int num){
        int countt=0;
        while(num>0){
            num=num/10;
            countt++;
        }
        return countt;
    }
     // Function to check if a number is an Armstrong number
    static boolean isArmstrong(int num,int count) {
        int temp = num, sum = 0;

        // Count number of digits
        while (num> 0) {
            int digit=num%10;
            num /= 10;
            sum=sum+power(digit,count);
        }
        // If sum is equal to the original number, it is an Armstrong number
        return sum == temp;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");
        int num = s.nextInt(); // number to check
        int count=cnt(num);
        if (isArmstrong(num,count)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        s.close();
    }

    

   
}