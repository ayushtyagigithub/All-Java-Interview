package dsa.question;

public class FindMin {
    public static void main(String [] args)
    {
        int a[]={5,2,90,-2,113,300,74};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("The minimum element in the array is :"+min);
    }
}
