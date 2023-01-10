import java.lang.StringBuilder;

public class App {

    public static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int current = n;
        while (current > 0) {
            int remainder = current % 3;
            if (remainder == 0) {
                sb.append('4');
            } else {
                sb.append(remainder);
            }

            current = (current - 1) / 3;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) throws Exception {
        System.out.println(solution(4));
    }
}
