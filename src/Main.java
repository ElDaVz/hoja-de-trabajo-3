import app.RandomNumbersGenerator;
import app.Sorter;

import java.io.IOException;
import java.util.Arrays;

/**
 * En esta clase se ejecutarán las pruebas y los profile
 * @author Cristian Orellana y Daniel Vasquez
 */
public class Main {

<<<<<<< HEAD
    // Tamaños a evaluar
    //private static final int[] SIZES = {10, 100, 500, 1000, 2000, 3000};

=======
>>>>>>> f7dae2f93dc4c10f89b790e37f4419b00a14a435
    public static void main(String[] args) throws IOException {
        var size = 1000000;
        RandomNumbersGenerator generator = new RandomNumbersGenerator(size);

<<<<<<< HEAD
        Integer[] data = generator.getArrayAsArray();

        Sorter.radixSort(data);
=======
        int[] sizes = {100000, 150000 , 200000 , 250000};

        for (int size : sizes) {

            // 1. Generar números y guardarlos en archivo
            new RandomNumbersGenerator(size);
>>>>>>> f7dae2f93dc4c10f89b790e37f4419b00a14a435


<<<<<<< HEAD
//        for (int size : SIZES) {
//
//            // 1. Generar números aleatorios y guardarlos en archivo
//            new RandomNumbersGenerator(size);
//
//            // 2. Leer archivo
//            Integer[] original = RandomNumbersGenerator.readFile();
//
//            System.out.println("\nTamaño del arreglo: " + size);
//
//            // ===== DATOS DESORDENADOS (caso promedio) =====
//            runAllSorts(original, "DESORDENADO");
//
//            // ===== DATOS ORDENADOS (mejor caso) =====
//            Integer[] ordered = original.clone();
//            Arrays.sort(ordered); // ordenamos una vez
//
//            runAllSorts(ordered, "ORDENADO");
//        }
//    }
//
//    private static void runAllSorts(Integer[] data, String scenario) {
//
//        System.out.println("Escenario: " + scenario);
//
//        // Gnome Sort
//        Integer[] gnomeArr = data.clone();
//        Sorter.gnomeSort(gnomeArr);
//
//        // Merge Sort
//        Integer[] mergeArr = data.clone();
//        Sorter.mergeSort(mergeArr);
//
//        // Quick Sort
//        Integer[] quickArr = data.clone();
//        Sorter.quickSort(quickArr);
//
//        // Radix Sort
//        Integer[] radixArr = data.clone();
//        Sorter.radixSort(radixArr);
//
//        // Heap Sort (sort elegido)
//        Integer[] heapArr = data.clone();
//        Sorter.heapSort(heapArr);
//


    }

=======
            // ===== GNOME SORT =====
           Integer[] gnomeArr = Arrays.copyOf(original, original.length);
            System.out.println(Arrays.toString(gnomeArr));
            Sorter.gnomeSort(gnomeArr);
            System.out.println(Arrays.toString(gnomeArr));
            Sorter.gnomeSort(gnomeArr);
            //System.out.println(Arrays.toString(gnomeArr));

            // ===== MERGE SORT =====
            Integer[] mergeArr = Arrays.copyOf(original, original.length);
            System.out.println(Arrays.toString(mergeArr));
            Sorter.mergeSort(mergeArr);
            System.out.println(Arrays.toString(mergeArr));
            Sorter.mergeSort(mergeArr);
            System.out.println(Arrays.toString(mergeArr));

            // ===== QUICK SORT =====
            Integer[] quickArr = Arrays.copyOf(original, original.length);
            System.out.println(Arrays.toString(quickArr));
            Sorter.quickSort(quickArr);
            System.out.println(Arrays.toString(quickArr));
            Sorter.quickSort(quickArr);
            System.out.println(Arrays.toString(quickArr));



            // ===== RADIX SORT =====
            Integer[] radixArr = Arrays.copyOf(original, original.length);
            System.out.println(Arrays.toString(radixArr));
            Sorter.radixSort(radixArr);
            System.out.println(Arrays.toString(radixArr));
            Sorter.radixSort(radixArr);
            System.out.println(Arrays.toString(radixArr));

            // ===== HEAP SORT =====
            Integer[] heapArr = Arrays.copyOf(original, original.length); // Creación del Array independiente
            System.out.println(Arrays.toString(heapArr));
            Sorter.heapSort(heapArr); // Desordenado
            System.out.println(Arrays.toString(heapArr));
            Sorter.heapSort(heapArr); // Ordenado
            System.out.println(Arrays.toString(heapArr));
        }
    }
>>>>>>> f7dae2f93dc4c10f89b790e37f4419b00a14a435
}
