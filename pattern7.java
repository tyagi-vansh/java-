public class pattern7 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++)
        {
            for(int j=i;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
            System.out.print("* ");
            }
            System.out.println();
        }
    }
}
