package dsa.recursiveprograms;

import java.util.Scanner;

public class NCRRecursion {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=s.nextInt();
        System.out.println("Enter the value of r");
        int r=s.nextInt();
        int res=getnCR(n,r);
        System.out.println(res);
    }

    public static int getnCR(int n,int r)
    {
        if(n==r || r==0)
        {
            return 1;
        }
        return getnCR(n-1,r-1)+getnCR(n-1,r);
    }
}
