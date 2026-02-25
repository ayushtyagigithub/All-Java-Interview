package streams;

import java.util.Arrays;
import java.util.function.Predicate;

public class TestPredicates {
    public static void main(String [] args)
    {
        Product p1=new Product("Mobile",10000,"electronics","A+");
        Product p2=new Product("TV",20000,"electronics","A");
        Product p3=new Product("Fridge",30000,"electronics","A+");
        Product p4=new Product("Sofa",40000,"furniture","B");
        Product p5=new Product("Table",50000,"furniture","B+");
        Product p6=new Product("Chair",60000,"furniture","A");
        Product p7=new Product("Fan",700,"electronics","B-");

        Arrays.asList(p1,p2,p3,p4,p5,p6,p7).stream().filter((x)->x.getPrice()>1000 || x.getCategory().equalsIgnoreCase("electronics")).forEach((z)->System.out.println(z));

//        Arrays.asList(p1,p2,p3,p4,p5,p6,p7).stream().filter((x)->x.getPrice()>1000).filter((y)->y.getCategory()=="electronics").forEach((z)->System.out.println(z));

//        Arrays.asList(p1,p2,p3,p4,p5,p6).stream().filter((prod)->prod.getPrice()>1000).forEach(x->System.out.println(x));

//        Arrays.asList(p1,p2,p3,p4,p5,p6).stream().filter((prod)->prod.getCategory()=="electronics").forEach((x)->System.out.println(x));
    }
}
