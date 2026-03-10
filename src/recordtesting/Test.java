package recordtesting;

public class Test {
    public static void main(String [] args)
    {
        Person p1=new Person(402,"ayush tyagi","ayushtyagi9858@gmail.com");
        System.out.println(p1);
        Person.display();
        p1.showData();
    }
}
