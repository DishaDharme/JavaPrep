package Sorting;

import java.util.Arrays;

public class selectionSort1 {
    public static void main(String[] args) {
        int[] arr={5,3,7,6,2,1,4};
        int n=arr.length;
        int max=arr[0];
        int indexOFMaxEle=0;
        for(int i=0;i<n-1;i++)
        {
            max=arr[0];
            if(max<arr[i])
            {
                max=arr[i];
            }
            indexOFMaxEle=i;
        }

        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[indexOFMaxEle])
            {
                int temp=arr[i];
                arr[i]=arr[indexOFMaxEle];
                arr[indexOFMaxEle]=temp;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
