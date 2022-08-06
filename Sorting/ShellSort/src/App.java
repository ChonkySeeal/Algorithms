public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public void shellSort(int[] arr) {
        int i, j;
        int temp;
        int l = 1;
        while (l < arr.length / 3) {
            l = l * 3 + 1;
        }
        while (l > 0) {
            for (i = l; i < arr.length; i++) {
                temp = arr[i];
                j = i;
                while (j > l - 1 && arr[j - l] >= temp) {
                    arr[j] = arr[j - l];
                    j -= l;
                }
                arr[j] = temp;
            }
            l = (l - 1) / 3;
        }
    }
}
