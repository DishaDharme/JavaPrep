package BitwiseOperatorsAndNumberSystem;

public class UniqueElementInArray {
    public static void main(String[] args) {
        int[] arr={2,4,3,2,3,6,4,6,1};
        System.out.println(findUnique(arr));
    }

    private static int findUnique(int[] arr) {
        int unique=0;
       for(int n:arr)
//            for(int n=0;n<arr.length;n++)
//        unique=unique^arr[n];
           unique=unique^n;
        return unique;
    }
}
