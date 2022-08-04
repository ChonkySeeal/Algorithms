public class App {
    public static void main(String[] args) throws Exception {

    }

    public void selectionSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = i;
            for (int j = i + 1; i < arr.length; j++) {
                if (arr[temp] > arr[j])
                    temp = j;
            }
            swap(i, temp);
        }
    }
}
