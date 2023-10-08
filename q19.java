import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        String s = sc.next();
        String c = sc.next();
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<c.length();j++)
            {
                if(s.charAt(i)==c.charAt(j))
                {
                    a++;
                }
                else
                {
                    continue;
                }
            }
        }
        if (a==s.length()||a==c.length())
        {
            System.out.println("anagram");
        }
        else {
            System.out.println("not anagram");
        }
        sc.close();
    }
    
}
