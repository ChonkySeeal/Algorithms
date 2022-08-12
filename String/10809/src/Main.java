import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int[] num = new int[26];
        for (int i = 0; i < 26; i++) {
            num[i] = -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int loc = arr[i] - 97;

            if (num[loc] == -1) {
                num[loc] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(num[i] + " ");
        }

    }
}
