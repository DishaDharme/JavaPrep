package Recursion;

public class r1 {
   /* public static void main(String[] args) {
       num(1);
       //it i want to print numbers from 1 to 5 without calling function 5 times or without writing print statement 5 times, So this can be achieved by recursion.
    }
    static void num(int n)
    {
        System.out.println(n);
        num2(2);
    }
    static void num2(int n)
    {
        System.out.println(n);
        num3(3);
    }
    static void num3(int n)
    {
        System.out.println(n);
        num4(4);
    }
    static void num4(int n)
    {
        System.out.println(n);
        num5(5);
    }
    static void num5(int n)
    {
        System.out.println(n);
    }*/


//instead of this we can use recursion here.

    public static void main(String[] args) {

       num(1);
    }
    static void num(int n)
    {
        //base condition
        if(n==5)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        num(n+1); //tail recursion
        //even if we are calling the same function again and again then also memory allocation happens that many times we are calling the funtion
        //base condition in recursion- where our recursion stops making new calls
        //every call of function call willll take some memory and when there is no base conditon then memory exceeds.
    }
}


