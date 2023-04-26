package MathsForDSA;
import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // printing all prime numbers from 1 till n

        // method 1: for loop method
        for(int i=2;i<=n;i++){
            // check every number
            boolean flag = true;
            for(int j=2;j<i;j++)
            {
               if(i%j==0){
                   flag = false;
                   break;
               }
            }
            if(flag==true) System.out.println(i);
        }
    }
}