package dsa.recursiveprograms;

import java.util.Scanner;

public class PallendomeRecursive {
    public static void main(String [] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the string :");
      String str=s.next();
      boolean res=checkPallendome(str,0,str.length()-1);
      System.out.println(res);
    }

    public static boolean checkPallendome(String str,int l,int r)
    {
        return getHelper(str,l,r);
    }
    public static  boolean getHelper(String str,int l,int r)
    {
        if(l>=r)
        {
            return true;
        }
        if(str.charAt(l)==str.charAt(r))
        {
            return getHelper(str,l+1,r-1);
        }
        else {
            return false;
        }
    }
}
