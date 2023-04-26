public class pat10 {
    public static void main(String[] args)
    {
   patt10(4);
    }
    static void patt10(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
