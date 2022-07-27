public class App {
    public static void main(String[] args) throws Exception {

    }

    public void selectionSort() {
        int in, out;
        for (out = 1; out < length; out++) {
            in = out;
            int temp = arr[out];
            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = temp;
        }
    }
}
