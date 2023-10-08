import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the character");
        char y = scanner.next().charAt(0);
        if(y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u' )
        {
            System.out.println("the entered character is a vowel");
        }
        else{
            System.out.println("the entered character is a consonant");
        }
        scanner.close();
    }
    
}
