package app;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbersGenerator {
    private ArrayList<Integer> arr;

    public RandomNumbersGenerator(int amount) {
        Random random = new Random();
        arr = new ArrayList<>(amount);

        for (int i = 0; i < amount; i++) {
            arr.add(random.nextInt(amount));
        }
    }

    public ArrayList<Integer> getArray() {
        return this.arr;
    }

    public Integer[] getArrayAsArray() {
        return this.arr.toArray(new Integer[0]);
    }
}
