package Patterns;

public class pat23 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            for (int j = i; j <= i; j++) {
                System.out.print(j);
                if(i==j)
                {
                    for(int k=2;k<=2;k++)
                    {
                        System.out.print(j+4);
                    }
                }
            }
            System.out.println();
           // for(int k=i+1;k<=)
        }
    }
}
