package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayImp {

       public static void main(String [] args)
       {

           List<Integer> aa=new ArrayList<>();
              aa.add(10);
              aa.add(20);
              aa.add(30);
              aa.add(40);
              aa.add(50);
              aa.add(60);
              aa.add(70);

              Collections.sort(aa,Collections.reverseOrder());


                System.out.println(aa);

//              System.out.println(Collections.max(aa));
//              System.out.println(Collections.min(aa));
//
//              System.out.println(Collections.reverseOrder());
//
//              System.out.println(Collections.frequency(aa,10));










//           int a[]={10,20,30,40,50,60,70,80,90};
//
//           int b[]=Arrays.copyOf(a,a.length);



//           int ac[]={10,20,30,40,50,60,70,80,90};
//
//           int dc[]=ac;
//
//
//           dc[0]=400;

//           System.out.println(ac[0]);




//           System.out.println(Arrays.toString(a));
//           System.out.println(Arrays.toString(b));

//           System.out.println(Arrays.equals(a,b));


//           System.out.println(a.length);
//           System.out.println(Arrays.binarySearch(a,90));
//           System.out.println(Arrays.binarySearch(a,5));
//              System.out.println(Arrays.toString(a));
//              Arrays.sort(a);
//
//            System.out.println(Arrays.toString(a));


       }

}


