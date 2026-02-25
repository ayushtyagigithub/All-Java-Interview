package GenericsUnderstanding;

public class Test {

    public static void main(String [] args)
    {
//        Animal a1=new Animal();
//        a1.eat();

        Dog d1=new Dog();
        d1.eat();

        Animal a2=d1;
        a2.eat();




//        SharkFish sharkFish = new SharkFish();
//        GoldFish goldFish = new GoldFish();
//        GoldFish goldFish2 = new GoldFish();
//
//
//        Aquarium<GoldFish> a1=new Aquarium<>(goldFish, sharkFish);
//        GoldFish fish1=a1.getFish1();
//        fish1.swim();


//        Aquarium aquarium = new Aquarium(goldFish, goldFish2);
//        SharkFish f1=(SharkFish) aquarium.getFish1();
//        f1.swim();




//        sharkFish.swim();
//        goldFish.swim();
    }
}
