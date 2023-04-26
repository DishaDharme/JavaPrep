public class pat9 {
    public static void main(String[] args)
    {
        pattern6(5);
    }
    static void pattern6(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
