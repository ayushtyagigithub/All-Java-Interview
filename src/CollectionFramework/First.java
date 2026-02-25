package CollectionFramework;

import com.sun.jdi.IntegerValue;

import java.util.*;

public class First {

    public static void main(String [] args)
    {





//        Student s1=new Student("Rohit","CSE","Modinagar",1);
//        Student s2=new Student("Rohit","CSE","Modinagar",1);
//
//        Set<Student> ob=new HashSet<>();
//        ob.add(s1);
//        ob.add(s2);
//
//        System.out.println(ob);


//        Student s1=new Student("Rohit","CSE","Modinagar",1);
//        Student s2=new Student("Rohit","CSE","Modinagar",1);
//
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//
//        System.out.println(s1.equals(s2));

//        Map<Integer,Integer> aa=new HashMap<>();
//        aa.put(1,34);
//        aa.put(2,21);
//        aa.put(3,90);
//        aa.put(4,32);
//        aa.put(5,90);
//        aa.put(1,100);
//
//        aa.putIfAbsent(5,900);


//        System.out.println(aa.containsKey(5));
//
//
//        System.out.println(aa);

//
//        for(Map.Entry<Integer,Integer> res:aa.entrySet())
//        {
//            System.out.println(res.getKey()+" "+res.getValue());
//        }


//        for(Integer res:aa.keySet())
//        {
//            System.out.println(res);
//        }

//        for(Integer res:aa.values())
//        {
//            System.out.println(res);
//        }


//






//        Set<Integer> aa=new TreeSet<>();
//
//        aa.add(34);
//        aa.add(21);
//        aa.add(90);
//        aa.add(32);
//        aa.add(90);
//
//
//        System.out.println(aa);



//       List<Integer> aa=new ArrayList<>();
//       aa.add(45);
//       aa.add(90);
//       aa.add(32);
//       aa.add(21);
//       aa.add(21);
//
//
//       Iterator bb =aa.iterator();
//       while(bb.hasNext())
//       {
//           System.out.println(bb.next());
//       }








//       System.out.println(aa);
//       aa.set(2,100);

//        aa.add(2,100);

//        System.out.println(aa.get(2));


//        System.out.println(aa.size());

//        System.out.println(aa.contains(21));


//        aa.remove(2);

//        aa.remove(Integer.valueOf(21));
//        System.out.println(aa);


//       System.out.println(aa);

//        Stack<Integer> aa=new Stack<>();
//        aa.push(23);
//        aa.push(21);
//        aa.push(90);
//        aa.push(24);
//
//        for(Integer bb:aa)
//        {
//            System.out.println(bb);
//        }
//
//        System.out.println(aa.peek());
//

//        ArrayDeque<Integer> aa=new ArrayDeque<>();
//        aa.offer(36);
//        aa.offer(19);
//        aa.offer(32);
//        aa.offer(90);
//        aa.offerFirst(100);


//        Iterator bb=aa.iterator();
//        while(bb.hasNext())
//        {
//            System.out.println(bb.next());
//        }
//        System.out.println(aa.peek());


//        Queue<Integer> aa=new PriorityQueue<>(Comparator.reverseOrder());
//        aa.offer(89);
//        aa.offer(32);
//        aa.offer(32);
//        aa.offer(21);
//        aa.offer(78);
//        aa.offer(7);
//
//        System.out.println(aa);


        List<Student> aa=new ArrayList<>();
        aa.add(new Student("Rohit","CSE","Modinagar",1));
        aa.add(new Student("Ayush","CSE","Modinagar",2));
        aa.add(new Student("Satyam","CSE","Modinagar",30));
        aa.add(new Student("Rahul","CSE","Modinagar",3));
        aa.add(new Student("Mohit","CSE","Modinagar",20));
        aa.add(new Student("Rohit","CSE","Modinagar",11));
        aa.add(new Student("Kunal","CSE","Modinagar",1));


        Collections.sort(aa,new NameSort());


        System.out.println(aa);





//        System.out.println(aa);

    }
}

