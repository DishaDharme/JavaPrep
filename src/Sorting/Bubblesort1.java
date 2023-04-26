package Sorting;

import java.util.Arrays;

public class Bubblesort1 {
    public static void main(String[] args) {
        int[] arr={2,5,4,3,1,-7};
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
