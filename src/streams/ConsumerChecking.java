package streams;

import java.util.function.IntConsumer;

public class ConsumerChecking {
    public static void main(String [] args)
    {
        IntConsumer c=(num)->{
            System.out.println(num*num);
        };
        c.accept(10);
    }
}
