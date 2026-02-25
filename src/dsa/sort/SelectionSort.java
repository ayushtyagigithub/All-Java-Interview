package dsa.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String [] args)
    {
        int a[]={4,1,8,2,3,7};
        for(int i=1;i<a.length;i++)
        {
            int last=i;
            int swap=i-1;
            int temp=a[last];
            while(swap>=0 && a[swap]>temp)
            {
                swap--;
            }
            for(int j=last;j>=swap+2;j--)
            {
                a[j]=a[j-1];
            }
            a[swap+1]=temp;
        }
        System.out.println("The elements in the array after swapping are :"+ Arrays.toString(a));
    }
}
