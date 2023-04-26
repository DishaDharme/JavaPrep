package Patterns;

public class pat17 {
    public static void main(String[] args)
    {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>n-i;j--)
            {
                System.out.print(j);
                for(int k = n - i; k >= i;k--)
                    System.out.print(j);
            }
            System.out.println();
        }
    }
}
