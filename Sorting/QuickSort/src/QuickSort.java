package Sorting.QuickSort.src;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        quicksort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (pivot >= arr[j]) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;
        return i + 1;

    }

    static void quicksort(int[] arr, int l, int r) {
        if (l < r) {
            int pivot = partition(arr, l, r);
            quicksort(arr, l, pivot - 1);
            quicksort(arr, pivot + 1, r);

        }
    }

}
