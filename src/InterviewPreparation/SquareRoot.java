package InterviewPreparation;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(squareRoot(n));
    }
    public static int squareRoot(int n){
        // step 1: define search space
        int start = 1, end = n;

        // step 2: while loop
        while(start<=end){
            // step 3: find mid and check it
            int mid = (start+end)/2;
            if(mid*mid==n) return mid;

            // step 4 : move left/right according to the problem statement
            else if(mid*mid>n) end = mid-1;

            else start = mid+1;
        }
        return -1;
    }
}
