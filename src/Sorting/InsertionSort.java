package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args)
    {
        int[] arr={6,3,2,4,1,5,-9};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionsort(int[] arr)
    {
        int temp,j;
        for(int i=1;i<arr.length;i++)
        {
            temp=arr[i];
            j=i;
            while(j>0 && arr[j-1]>temp)
            {
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=temp;

        }

    }

}
