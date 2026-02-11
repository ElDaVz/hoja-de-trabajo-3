package app;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Clase encargada de generar números random, almacenarlos en un archivo
 * y de lograr leer el archivo
 */
public class RandomNumbersGenerator {
    private ArrayList<Integer> arr;

    /**
     *Genera números random, la cantidad de números generados está definido por
     * la variable amount, de igual forma genera el archivo en el que se guardaran
     * @param amount
     */
    public RandomNumbersGenerator(int amount) {
        Random random = new Random();
        arr = new ArrayList<>(amount);

        for (int i = 0; i < amount; i++) {
            arr.add(random.nextInt(amount));
        }

        saveToFile("datos.txt");
    }

    /**
     * Encargado de guardar y almacenar los datos en el archivo previamente creado
     * @param fileName
     */
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

    /**
     * Encargado de permitir la lectura del archivo creado en donde se
     * guardaron los datos
     * @return
     * @throws IOException
     */
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

    /**
     * Get del array
     * @return
     */
    public ArrayList<Integer> getArray() {
        return arr;
    }

    /**
     * Get del array como un array
     * @return
     */
    public Integer[] getArrayAsArray() {
        return this.arr.toArray(new Integer[0]);
    }
}
