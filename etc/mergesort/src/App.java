import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] array = { 230, 10, 60, 550, 40, 220, 20 };

        mergeSort(array, 0, array.length - 1);

        for (int v : array) {
            System.out.println(v);
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] leftArr = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightArr = Arrays.copyOfRange(arr, mid + 1, right + 1);
        int i = 0, j = 0, leftArrLen = leftArr.length, rightArrLen = rightArr.length, index = left;
        while (i < leftArrLen && j < rightArrLen) {
            if (leftArr[i] <= rightArr[j]) {
                arr[index] = leftArr[i++];
            } else {
                arr[index] = rightArr[j++];
            }
            index++;
        }
        while (i < leftArrLen)
            arr[index++] = leftArr[i++];
        while (j < rightArrLen)
            arr[index++] = rightArr[j++];
    }
}
