public class App {
    public static void main(String[] args) throws Exception {
        int[] array = { 230, 10, 60, 550, 40, 220, 20 };
        heapsort(array);
        for (int v : array) {
            System.out.println(v);
        }
    }

    public static void heapsort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            swap(arr, i, 0);
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int p = i, l = 2 * i + 1, r = 2 * i + 2;

        if (l < n && arr[l] > arr[p]) {
            p = l;
        }

        if (r < n && arr[r] > arr[p]) {
            p = r;
        }

        if (p != i) {
            swap(arr, p, i);
            heapify(arr, n, p);
        }

    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
