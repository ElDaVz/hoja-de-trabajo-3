package app;

public class Sorter {

    private Sorter() {}

    public static <T extends Comparable<T>> void gnomeSort(T[] arr) {
        if (arr == null || arr.length == 0) return;

        int index = 0;

        while (index < arr.length) {
            if (index == 0) {
                index++;
            } else if (arr[index].compareTo(arr[index - 1]) >= 0) {
                index++;
            } else {
                T temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
    }

    public static <T extends Comparable<T>> void mergeSort(T[] arr) {
        if (arr == null || arr.length <= 1) return;
        mergeSort(arr, 0, arr.length - 1);
    }

    private static <T extends Comparable<T>> void mergeSort(T[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static <T extends Comparable<T>> void merge(T[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Object[] L = new Object[n1];
        Object[] R = new Object[n2];

        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            T leftVal = (T) L[i];
            T rightVal = (T) R[j];

            if (leftVal.compareTo(rightVal) <= 0) {
                arr[k++] = leftVal;
                i++;
            } else {
                arr[k++] = rightVal;
                j++;
            }
        }

        while (i < n1) {
            arr[k++] = (T) L[i++];
        }

        while (j < n2) {
            arr[k++] = (T) R[j++];
        }
    }

    public static <T extends Comparable<T>> void quickSort(T[] arr) {
        if (arr == null || arr.length <= 1) return;
        quickSort(arr, 0, arr.length - 1);
    }

    private static <T extends Comparable<T>> void quickSort(T[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static <T extends Comparable<T>> int partition(T[] arr, int low, int high) {
        T pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        T temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static <T extends Comparable<T>> void heapSort(T[] array) {
        if (array == null || array.length == 0) return;

        int length = array.length;

        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(array, length, i);
        }

        for (int i = length - 1; i > 0; i--) {
            T temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    public static <T extends Comparable<T>> void heapify(T[] array, int length, int i) {
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        int largest = i;

        if (leftChild < length && array[leftChild].compareTo(array[largest]) > 0) {
            largest = leftChild;
        }

        if (rightChild < length && array[rightChild].compareTo(array[largest]) > 0) {
            largest = rightChild;
        }

        if (largest != i) {
            T temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heapify(array, length, largest);
        }
    }

    public static void radixSort(Integer[] arr) {
        if (arr == null || arr.length == 0) return;

        int n = arr.length;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        int max = temp[0];
        for (int num : temp) {
            if (num > max) max = num;
        }

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(temp, exp);
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
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
