package BitwiseOperatorsAndNumberSystem;

public class noOfDigits {
    public static void main(String[] args) {
        int n=10087;
        int base=10;
        int ans= (int)(Math.log(n)/Math.log(base))+1;
        System.out.println(ans);

    }
}
