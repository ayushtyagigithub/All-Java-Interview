package GenericsPractise;

import java.util.ArrayList;
import java.util.List;

public class First {
    public static void main(String [] args)
    {


            List<Integer> list=new ArrayList<>();
            list.add(23);
            list.add(45);
            list.add(67);

            First f1=new First();
            f1.printList(list);



//
//        Ayush<Integer> a1=new Ayush<>();
//        a1.getData(23);
//
//        Ayush<String> a2=new Ayush<>();
//        a2.getData("Hello");
//
//        System.out.println(a1.display());
//        System.out.println(a2.display());
//


//        Box b1=new Box();
//        b1.getData(23);
//        b1.getData("String");




//        Box<Integer> b1=new Box<>(23);
//
//        Box<String> b2=new Box<>("Hello");
//
//        System.out.println(b1.getValue());
//
//        System.out.println(b2.getValue());

//       ArrayList a=new ArrayList();
//       a.add(23);
//       a.add("hELLO");
//       a.add(23.45);
//
//       String res=(String) a.get(0);
//
//       System.out.println(res);
    }



    public void printList(List<? extends Number> number)
    {
        for(Object n:number)
        {
            System.out.println(n);
        }
    }
}
