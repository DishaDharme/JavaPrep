package InterviewPreparation;

import java.util.Scanner;

public class printNthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
          if(n<0)
          {
              System.out.println("n cant be -ve");
              return;
          }
          if(n==0)
          {
              System.out.println(a);
          }
          else if(n==1)
          {
              System.out.println(b);
          }
          else {
           //   int c=0;
              for(int i=2;i<=n;i++) {

                  c = a + b;
                  a = b;
                  b = c;
              }
              System.out.println(c);

          }
    }
}


