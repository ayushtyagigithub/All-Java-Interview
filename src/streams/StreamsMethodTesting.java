package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class StreamsMethodTesting {
    public static void main(String [] args)
    {
        List<Integer> aa=Arrays.asList(45,10,11,28,93,20,72,74,84);
//        OptionalDouble res=aa.stream().mapToInt(x->x*2).average();
//        System.out.println(res.getAsDouble());
//
//
//        int r=aa.stream().mapToInt(x->x+2).sum();
//        System.out.println(r);

        Optional res=aa.stream().reduce((a,b)->a+b);
        System.out.println(res.get());
    }

}
