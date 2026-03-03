package lamdaschecking;

import java.util.Arrays;
import java.util.List;

public class SortNumberReverse {
    public static void main(String [] args)
    {
        List<Integer> list=Arrays.asList(45,83,20,64,10,04,72,55);
        list.stream().sorted((a,b)->b-a).forEach((b)->System.out.print(b+" "));
    }
}
