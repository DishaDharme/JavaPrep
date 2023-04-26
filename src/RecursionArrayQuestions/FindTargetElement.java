package RecursionArrayQuestions;

public class FindTargetElement {
    public static void main(String[] args) {
        int[] arr={2,4,3,6,7};
        int target=8;
        int index=0;
        System.out.println(find(arr,target,index));
    }
    static boolean find(int[] arr,int target,int index)
    {
        if(index==arr.length)
        {
            return false;
        }
        return arr[index]==target || find(arr,target,index+1);
    }
}
