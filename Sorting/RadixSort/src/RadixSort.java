import java.util.Arrays;

public class RadixSort {

    static int getMax(int arr[], int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

    static void countSort(int arr[], int n, int place) {
        int[] output = new int[n + 1];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < max; i++)
            count[i] = 0;

        for (int i = 0; i < n; i++) {
            count[(arr[i] / place) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / place) % 10] - 1] = arr[i];
            count[(arr[i] / place) % 10]--;
        }

        for (int i = 0; i < n; i++)
            arr[i] = output[i];

    }

    void radixSort(int arr[], int size) {
        int max = getMax(arr, size);

        for (int place = 1; max / place > 0; place *= 10)
            countSort(arr, size, place);
    }

    public static void main(String[] args) throws Exception {
        int[] data = { 121, 432, 564, 23, 1, 45, 788 };
        int size = data.length;
        RadixSort rs = new RadixSort();
        rs.radixSort(data, size);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
