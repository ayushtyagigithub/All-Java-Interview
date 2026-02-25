package dsa.pattern;

public class Fifth {
    public static void main(String [] args)
    {
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=6-i;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=0;k<=2*i-3;k++)
            {
                if(k==2*i-3)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int j=5;j>0;j--)
        {
            for(int k=1;k<=5-j+1;k++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=0;k<=2*j-3;k++)
            {
                if(k==2*j-3)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}
