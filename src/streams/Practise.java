package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practise {
    public static void main(String [] args)
    {
//        List<Integer> list =Arrays.asList(34,90,34,100,56,21,58);
//         List<Integer> res=list.stream().filter(x->x%2==0).collect(Collectors.toList());
//         for(Integer aa:res)
//         {
//             System.out.println(aa);
//         }

        Stream.iterate(1,x->x+5).limit(100).forEach(x->System.out.println(x));
    }
}
