package streams;

import java.util.function.IntPredicate;

public class PredicateChecking {
    public static void main(String [] args)
    {
        IntPredicate p=(num)->{
            int count=0;
            for(int i=2;i<num;i++)
            {
                if(num%i==0)
                {
                    count++;
                }
            }
            if(count>0)
            {
                return false;
            }
          return true;
        };

       System.out.println( p.test(28));
    }
}
