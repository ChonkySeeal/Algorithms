import java.util.HashSet;
import java.util.Set;

public class App {
    public int solution(int N, int number) {
        int answer = -1;
        Set<Integer>[] set = new Set[9];
        int t = N;
        for (int i = 1; i < 9; i++) {
            set[i] = new HashSet<>();
            set[i].add(t);
            t = t * 10 + N;
        }
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < i; j++) {
                for (Integer a : set[j]) {
                    for (Integer b : set[i - j]) {

                    }
                }
            }
        }
    }
}
