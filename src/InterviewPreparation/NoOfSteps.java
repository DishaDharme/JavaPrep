package InterviewPreparation;

public class NoOfSteps {
    public static void main(String[] args) {
        int n=795;
        int count=0;
        while(n>9) {
            int ans=1;
            while (n > 0) {

                int rem = 0;
                rem = n % 10;
                ans = ans * rem;
                n = n / 10;
            }
            count++;
            n=ans;
        }
        System.out.println(count);
    }
}
