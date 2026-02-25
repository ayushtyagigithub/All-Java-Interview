package streams;

import java.util.function.IntFunction;

public class FunctionChecking {
    public static void main(String [] args)
    {
        IntFunction f=(num)->{
          return num*100;
        };
        System.out.println(f.apply(100));
    }
}
