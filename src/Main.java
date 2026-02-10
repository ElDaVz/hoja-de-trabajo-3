import app.RandomNumbersGenerator;
import app.Sorter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        RandomNumbersGenerator g = new RandomNumbersGenerator(10);
        var h = g.readFile();
        for (Integer n : h) {
            System.out.println(n);
        }
    }
}
