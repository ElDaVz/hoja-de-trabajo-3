package app;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RandomNumbersGenerator {
    private ArrayList<Integer> arr;

    public RandomNumbersGenerator(int amount) {
        Random random = new Random();
        arr = new ArrayList<>(amount);

        for (int i = 0; i < amount; i++) {
            arr.add(random.nextInt(amount));
        }

        saveToFile("datos.txt");
    }

    private void saveToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Integer number : arr) {
                writer.write(number.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Integer[] readFile() throws IOException {
        List<Integer> list = new ArrayList<>();
        File file = new File("datos.txt");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    list.add(scanner.nextInt());
                } else {
                    scanner.next();
                }
            }
        }
        return list.toArray(new Integer[0]);
    }

    public ArrayList<Integer> getArray() {
        return arr;
    }

    public Integer[] getArrayAsArray() {
        return this.arr.toArray(new Integer[0]);
    }
}
