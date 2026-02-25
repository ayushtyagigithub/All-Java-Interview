package dsa.pattern;

public class Eighth {
    public static void main(String [] args)
    {
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=6-i;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");

            if(i==6)
            {
                for(int j=0;j<=2*i-3;j++)
                {
                    System.out.print("*");
                }
            }
            else {
                for(int j=0;j<=2*i-3;j++)
                {
                    if(j==2*i-3)
                    {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
}
