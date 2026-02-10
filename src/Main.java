import app.RandomNumbersGenerator;
import app.Sorter;

public class Main {
    public static void main(String[] args) {
        RandomNumbersGenerator g = new RandomNumbersGenerator(3000);
        var array = g.getArrayAsArray();

        Sorter.gnomeSort(array);
        Sorter.heapSort(array);
    }
}
