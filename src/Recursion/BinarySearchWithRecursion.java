package Recursion;

public class BinarySearchWithRecursion {
    public static void main(String[] args)
    {
        //if in the recursion calls two or more recursion calls are doing the same work,don't compute it again and again, use dynamic programming
        //types of recurrence relation : 1.linear r.r 2.divide and conquer r.r
        //fibonacci series - linear r.r
        //f(n/2)+f(n2/4)(binary search) - divide and conquer r.r
            int[] arr={1,2,3,4,55,66};
            int target=66;
       // System.out.println(search(arr,66,0,arr.length-1));
        System.out.println(search(arr,target,0,arr.length-1));

    }
    static int search(int[] arr,int target,int s,int e)//whatever variables u need to pass in the future calls,put it inside the arguments e.g: start,end
            //what all variables that you think are valuable in that function call, put it in function body e.g: mid
    {
        if(s>e)
        {
            return -1;
        }
        int mid=s*(e-s)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        if(target<arr[mid])
        {
           // e=mid-1;
          return search(arr,target,s,mid-1); //make sure to return a result of a function call of the return type
            //meaning of above stmt is return answer you are getting from this
            //it is saying that ok I don't care now,,,You are solving the left hand part.so give me answer for left hand part

        }

           return search(arr,target,mid+1, e);


    }
}
