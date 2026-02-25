package streams;

import java.util.function.IntSupplier;

public class SupplierChecking {
    public static void main(String [] args)
    {
        IntSupplier randomBelow5000 = () -> (int)(Math.random() * 5000);

        int randomValue = randomBelow5000.getAsInt();
        System.out.println(randomValue);

    }
}
