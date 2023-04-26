package BitwiseOperatorsAndNumberSystem;

public class FindithBitOfANumber {
    public static void main(String[] args) {
        int n = 6;
        int i = 3;
        Findithbit(n,i);

    }
    public static void Findithbit(int n,int i)
    {
        System.out.println(n&(1<<(i-1)));
    }

}
