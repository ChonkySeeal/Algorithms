public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 1, 6, 2, 8, 9 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
        System.out.println();
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void selectionSort(int[] arr) {

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int out = arr[i];
            int j = i - 1;
            while (arr[j] > out && j >= 0) {
                arr[j + 1] = arr[j];
                --j;
            }

            arr[j + 1] = out;

        }
    }
}
