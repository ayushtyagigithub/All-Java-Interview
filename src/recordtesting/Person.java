package recordtesting;

public record Person(int id,String name,String email) {

    public static void display()
    {
        System.out.println("this is a record class");
    }

    public void showData()
    {
        System.out.println(this.id+" "+this.name+" "+this.email);
    }
}
