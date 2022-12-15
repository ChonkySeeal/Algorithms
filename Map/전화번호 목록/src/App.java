import java.util.HashSet;

public class App {
    public static boolean solution(String[] phone_book) {
        HashSet<String> hs = new HashSet<>();

        for (int i = 0; i < phone_book.length; i++)
            hs.add(phone_book[i]);
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (hs.contains(phone_book[i].substring(0, j)))
                    return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        String[] book = { "119", "97674223", "1195524421" };
        solution(book);
    }
}
