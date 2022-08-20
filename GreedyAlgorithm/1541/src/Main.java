import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.MAX_VALUE;
        String[] arr1 = br.readLine().split("-");
        for (int i = 0; i < arr1.length; i++) {
            int temp = 0;

            String[] arr2 = arr1[i].split("\\+");

            for (int j = 0; j < arr2.length; j++) {
                temp += Integer.parseInt(arr2[j]);
            }

            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }

        }
        System.out.println(sum);
    }
}
