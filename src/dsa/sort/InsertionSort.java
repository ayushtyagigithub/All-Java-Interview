package dsa.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String [] args)
    {
        int a[]={4,92,82,100,-4,27,11,35};
        for(int i=0;i<a.length;i++)
        {
            int min=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        System.out.println("After swapping the elements in the array are :"+ Arrays.toString(a));
    }
}
