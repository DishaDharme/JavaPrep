package InterviewPreparation;

public class CountDigitsInANumber {
    public static void main(String[] args) {
      /* int n=234456;
        int n=-23424;
        int n=0;

        if(n==0)
        {
            System.out.println(1);
        }
        if(n<0)
        {
            n=-n;
        }

        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);*/

        int n=0;
        System.out.println(countDigits(n));

    }
    public static int countDigits(int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            n=-n;

        }
        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        return count;
    }
}
