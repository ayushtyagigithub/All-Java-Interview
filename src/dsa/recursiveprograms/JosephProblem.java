package dsa.recursiveprograms;

import java.util.Scanner;

public class JosephProblem {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int  n=s.nextInt();
        System.out.println("Enter the value of k");
        int k=s.nextInt();
        int res=getJoseph(n,k);
        System.out.println(res);
    }

    public static int getJoseph(int n,int k)
    {
        if(n==1)
        {
            return 0;
        }
        return (getJoseph(n-1,k)+k)%n;
    }
}
