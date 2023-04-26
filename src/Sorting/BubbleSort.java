package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args)

    {
        int[] arr={-1,4,-5,3,2};
        //int[] arr={};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubblesort(int[] arr)
    {
        boolean swapped;

        //outer for loop - i=0: pass 1,i=1: pass 2
        for(int i=0; i<arr.length;i++)
        {
            swapped=false;
            //inner for loop- for each step max item will come at last respective index
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }

            }
            if(!swapped)
            {
                break;
            }
        }
    }
}
