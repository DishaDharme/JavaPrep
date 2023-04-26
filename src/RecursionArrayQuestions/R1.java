package RecursionArrayQuestions;

public class R1 {
    public static void main(String[] args) {
        //whether array is sorted or not

        int[] arr={1,5,3,4};
        int start=0;
        System.out.println(isSorted(arr,start));

    }
    static boolean isSorted(int[] arr,int start)
    {
        //base condition
        if(start==arr.length-1) return true;



        return arr[start]<arr[start+1] && isSorted(arr,start+1);




    }
}
