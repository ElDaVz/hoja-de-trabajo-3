package app;

public class Sorter {
    private Sorter() {
        //...
    }

    public static int getMax(Integer[] array)  {
        var max = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void radixSort(Integer[] arr) {
        if (arr == null || arr.length == 0) return;

        int n = arr.length;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[i]; // unboxing seguro
        }

        int max = temp[0];
        for (int num : temp) {
            if (num > max) max = num;
        }

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(temp, exp);
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i]; // boxing de regreso
        }
    }

    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int num : arr) {
            count[(num / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        System.arraycopy(output, 0, arr, 0, n);
    }

}