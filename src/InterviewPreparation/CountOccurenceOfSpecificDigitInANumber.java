package InterviewPreparation;

public class CountOccurenceOfSpecificDigitInANumber {
    public static void main(String[] args) {
        int n=4425644;
        int d=4;
        int ans=count(n,d);
        System.out.println(ans);
        }
        public static int count(int n,int D)
        {
            if(n==0 && D==0)
            {
                return 1;
            }
            if(n<0)
            {
                n=-n;
            }
            int c=0;
            while(n!=0)
            {
                int digit=n%10;
                if(digit==D)
                {
                    c++;

                }
                n=n/10;
            }
            return c;
        }

}
