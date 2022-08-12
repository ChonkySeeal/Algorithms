import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            int N = input.charAt(0) - '0';
            char[] letters = input.substring(2).toCharArray();
            for (int j = 0; j < letters.length; j++) {
                for (int k = 0; k < N; k++) {
                    System.out.print(letters[j]);
                }
            }
            System.out.println();

        }

    }
}
