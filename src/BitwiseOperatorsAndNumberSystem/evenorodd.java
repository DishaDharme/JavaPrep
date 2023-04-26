package BitwiseOperatorsAndNumberSystem;

public class evenorodd {
    public static void main(String[] args) {
       int n=79;
        System.out.println(isOdd(n));
    }

    private static boolean isOdd(int n) {
        return (n&1)==1;
    }
}
