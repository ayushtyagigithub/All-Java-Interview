package dsa.question;

import java.util.Arrays;

public class SwapLastElementInArray {

    public static void main(String [] args)
    {
        int a[]={2,5,6,8,9,4};
        System.out.println("Before swapping the element in the array look like :"+ Arrays.toString(a));
        int last=a.length-1;
        int temp=a[last];
        int swap=last-1;
        while(swap>=0 && a[swap]>a[last])
        {
            swap--;
        }
        for(int i=last;i>=swap+2;i--)
        {
            a[i]=a[i-1];
        }
        a[swap+1]=temp;
        System.out.println("After swapping the element in the array look like "+Arrays.toString(a));
    }
}
