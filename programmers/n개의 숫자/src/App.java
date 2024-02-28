public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(long i= 0, j = x; i < n; i++, j = j + x) {
            answer[((int) i)] = j;
        }

        return answer;
    }
}
