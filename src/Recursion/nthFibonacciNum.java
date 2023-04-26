package Recursion;

public class nthFibonacciNum {
    public static void main(String[] args) {

        System.out.println(fibonacci(3));
    }
    static int fibonacci(int n)
    {
        //base condition
        if(n<2)
        {
            return n;
        }
        return fibonacci(n-1)+ fibonacci(n-2); //this is not tail recursion bcoz here function is returning values which are added further so there are more steps after calling function.
    }
}
