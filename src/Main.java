import app.RandomNumbersGenerator;
import app.Sorter;

import java.io.IOException;
import java.util.Arrays;

/**
 * En esta clase se ejecutarán las pruebas y los profile
 * @author Cristian Orellana y Daniel Vasquez
 */
public class Main {

    public static void main(String[] args) throws IOException {

        int[] sizes = {250000};

        for (int size : sizes) {

            // 1. Generar números y guardarlos en archivo
            new RandomNumbersGenerator(size);

            // 2. Leer archivo
            Integer[] original = RandomNumbersGenerator.readFile();

            // ===== GNOME SORT =====
           /* Integer[] gnomeArr = Arrays.copyOf(original, original.length);
            System.out.println(Arrays.toString(gnomeArr));
            Sorter.gnomeSort(gnomeArr);
            System.out.println(Arrays.toString(gnomeArr));
            Sorter.gnomeSort(gnomeArr);
            //System.out.println(Arrays.toString(gnomeArr));*/

            // ===== MERGE SORT =====
           /* Integer[] mergeArr = Arrays.copyOf(original, original.length);
            System.out.println(Arrays.toString(mergeArr));
            Sorter.mergeSort(mergeArr);
            System.out.println(Arrays.toString(mergeArr));
            Sorter.mergeSort(mergeArr);
            System.out.println(Arrays.toString(mergeArr));*/

            // ===== QUICK SORT =====
            /*Integer[] quickArr = Arrays.copyOf(original, original.length);
            System.out.println(Arrays.toString(quickArr));
            Sorter.quickSort(quickArr);
            System.out.println(Arrays.toString(quickArr));
            Sorter.quickSort(quickArr);
            System.out.println(Arrays.toString(quickArr));*/



            // ===== RADIX SORT =====
            /*Integer[] radixArr = Arrays.copyOf(original, original.length);
            System.out.println(Arrays.toString(radixArr));
            Sorter.radixSort(radixArr);
            System.out.println(Arrays.toString(radixArr));
            Sorter.radixSort(radixArr);
            System.out.println(Arrays.toString(radixArr));*/

            // ===== HEAP SORT =====
            Integer[] heapArr = Arrays.copyOf(original, original.length); // Creación del Array independiente
            System.out.println(Arrays.toString(heapArr));
            Sorter.heapSort(heapArr); // Desordenado
            System.out.println(Arrays.toString(heapArr));
            Sorter.heapSort(heapArr); // Ordenado
            System.out.println(Arrays.toString(heapArr));
        }
    }
}
