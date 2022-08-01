public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public void shellSort(int[] arr) {
        int i, j;
        int temp;
        int h = 1;
        while (h <= arr.length / 3)
            h = h * 3 + 1;
        while (h > 0) {
            for (i = h; i < arr.length; i++) {
                temp = arr[i];
                j = i;
                while (j > h - 1 && arr[j - h] >= temp) {
                    arr[j] = arr[j - h];
                    j -= h;
                }
                arr[j] = temp;
            }
            h = (h - 1) / 3;
        }
    }
}
