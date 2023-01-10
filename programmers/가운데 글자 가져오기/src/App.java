public class App {

    public static String solution(String s) {
        return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(solution("abcef"));
    }
}
