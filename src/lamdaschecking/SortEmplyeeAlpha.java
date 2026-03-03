package lamdaschecking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortEmplyeeAlpha {
    public static void main(String [] args)
    {
        List<Employee> list=new ArrayList<>();
        Employee e1=new Employee("Ravi",402,"cse");
        Employee e2=new Employee("Ajay",401,"cse");
        Employee e3=new Employee("Suresh",403,"cse");
        Employee e4=new Employee("Vijay",404,"cse");
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.stream().sorted((a,b)->a.getName().compareTo(b.getName())).forEach((a)->System.out.print(a.getName()+" "));
    }
}
