package lamdaschecking;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondBiggest {
    public static void main(String [] args)
    {
        List<Integer> list=Arrays.asList(34,90,72,16,3,7,84,38,64,29);
        Optional res =list.stream().sorted((a, b)->b-a).skip(1).findFirst();
        System.out.println(res.get());
    }
}
