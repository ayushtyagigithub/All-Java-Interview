package dsa.question;

import java.util.Arrays;

public class Swap {
    public static void main(String [] args)
    {
       int a[]={45,12,0,-1,34,56};
       System.out.println("Before swapping the array is :"+Arrays.toString(a));
       int temp=a[4];
       a[4]=a[0];
       a[0]=temp;
       System.out.println("After swapping the array is :"+Arrays.toString(a));
    }
}
