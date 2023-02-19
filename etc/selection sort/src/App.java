import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 3, 2, 8, 5 };

        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] > arr[j])
                    index = j;
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
