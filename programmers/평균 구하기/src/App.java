import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(Double.NaN);
    }
}
