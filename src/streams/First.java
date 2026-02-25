package streams;

public class First {

    public static void main(String [] args)
    {
        Box b=()->{
          System.out.println("Eating");
        };
        b.eat();
    }
}

interface Box
{
    public void eat();
}

