package dsa.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String [] args)
    {
       int a[]={5,4,-4,39,19,93,0,38};
       int last=a.length-1;
       for(int i=0;i<last;i++)
       {
           boolean swap=false;
           for(int j=0;j<last-i;j++)
           {
               if(a[j]>a[j+1])
               {
                   int temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
                   swap=true;
               }
           }
           if(!swap)
           {
                break;
           }
       }
       System.out.println("After swapping the element in the array are :"+ Arrays.toString(a));
    }
}
