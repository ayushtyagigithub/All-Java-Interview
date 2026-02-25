package dsa.recursiveprograms;

import java.util.Scanner;

public class FibonacciOfNNumber {
   public static void main(String [] args)
   {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the number :");
       int num=s.nextInt();
       int res=getFibonacci(num);
       System.out.println(res);
   }
   public static int getFibonacci(int num)
   {
       if(num==1 || num==0)
       {
           return num;
       }
       return getFibonacci(num-1)+getFibonacci(num-2);
   }
}
