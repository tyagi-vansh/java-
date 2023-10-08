import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string");
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
              int c=0;
            char q=s.charAt(i);
            for(int j=0;j<s.length();j++){
                char w=s.charAt(j);
                if(q==w){
                    c++;
                }
            }
            System.out.println("the "+q+" is present ="+c+"times");
          }
          sc.close();
    }
    
}
