package BitwiseOperatorsAndNumberSystem;

public class RangeXOR {
    public static void main(String[] args) {
       int a=3;
       int b=9;
       int ans= rangeXor(b)^rangeXor(a-1);
        System.out.println(ans);
    }
    public static int rangeXor(int a)
    {
        if(a%4==0)
        {
            return a;
        }
        if(a%4==1)
        {
            return 1;
        }
        if(a%4==2)
        {
            return a+1;
        }
        return 0;
    }
}
