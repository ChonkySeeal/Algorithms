import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c = br.readLine().toCharArray();
        int[] num = new int[26];
        char Ans = '?';
        int max = 0;
        for (int i = 0; i < c.length; i++) {

            if ('A' <= c[i] && c[i] <= 'Z')
                num[c[i] - 'A'] += 1;
            else
                num[c[i] - 'a'] += 1;
        }

        for (int i = 0; i < 26; i++) {
            if (max < num[i]) {
                max = num[i];
                Ans = (char) (i + 65);
            } else if (max == num[i]) {
                Ans = '?';
            }

        }

        System.out.print(Ans);

    }
}
