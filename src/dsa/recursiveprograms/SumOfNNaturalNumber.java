package dsa.recursiveprograms;

import java.util.Scanner;

public class SumOfNNaturalNumber {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=s.nextInt();
        int res=getSum(num);
        System.out.println(res);
    }

    public static int getSum(int num)
    {
        if(num==1)
        {
            return 1;
        }
        return getSum(num-1)+num;
    }
}
