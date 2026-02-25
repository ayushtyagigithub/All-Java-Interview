package dsa.recursiveprograms;

public class PractiseRecursion {

    public static void main(String [] args)
    {
        fun(10);
    }

    public static void fun(int n)
    {
        if(n>0)
        {
            System.out.println(n);
            fun(n-1);
        }

    }
}
