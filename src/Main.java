import app.RandomNumbersGenerator;
import app.Sorter;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    // Tamaños a evaluar
    //private static final int[] SIZES = {10, 100, 500, 1000, 2000, 3000};

    public static void main(String[] args) throws IOException {
        var size = 1000000;
        RandomNumbersGenerator generator = new RandomNumbersGenerator(size);

        Integer[] data = generator.getArrayAsArray();

        Sorter.radixSort(data);


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

}
