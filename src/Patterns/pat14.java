package Patterns;

public class pat14 {
    public static void main(String[] args) {
        patt14(4);
    }
    static void patt14(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print(k);
            }
            for(int m=2;m<=i;m++)
            {
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
