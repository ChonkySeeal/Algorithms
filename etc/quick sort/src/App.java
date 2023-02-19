import java.util.Arrays;

public class App {

    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = partition(arr, left, right);
        quickSort(arr, left, pivot - 1);
        quickSort(arr, pivot + 1, right);

    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left, j = right;
        while (i < j) {
            while (pivot < arr[j])
                j--;
            while (i < j && pivot >= arr[i])
                i++;
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        arr[left] = arr[i];
        arr[i] = pivot;
        return i;
    }

    public static void main(String[] args) throws Exception {
        int[] arr = { 3, 2, 8, 5, 9, 7, 8 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
