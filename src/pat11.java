public class pat11 {
    public static void main(String[] args)
    {
            patt11(4);
    }
    static void patt11(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=n-1;k>=i;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
