package InterviewPreparation;
import java.util.Scanner;
import static java.lang.Math.floor;
public class Narcissist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // write your code here
        double digit=Math.log10(n);
        int d=(int)(digit)+1;
        int org = n;

        int sum=0;
        while(n!=0)
        {
            int rem = n%10;
            sum += Math.pow(rem,d);
            n = n/10;
        }

        if(sum==org) System.out.println("Yes, the number is Narcissist");
        else System.out.println("No, number is not Narcissist");
    }
}
