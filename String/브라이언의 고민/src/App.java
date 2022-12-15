import java.util.ArrayDeque;

public class App {
    public String solution(String sentence) {
        try {
            String answer = "";
            ArrayDeque<Character> ad = new ArrayDeque<>();
            int[] count = new int[26];
            for (int i = 0; i < sentence.length(); i++) {
                ad.add(sentence.charAt(i));
                if (sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') {
                    count[sentence.charAt(i) - 'a']++;
                }
            }

            while (!ad.isEmpty()) {
                char first = ad.poll();
                ArrayDeque<Character> word = new ArrayDeque<>();

                if (first >= 'a' && first <= 'z') {
                    if(count[first-'a'] != 2) return "invalid";
                    if (ad.peek() >= 'a' && ad.peek() <= 'z') return "invalid";
                    word.add(ad.poll());
                    char third = ad.poll();
                    if(third >= 'a' && third <= 'z' && third != first) {
                        for(int i =1;i<count[third-'a'];i++) {
                            if(ad.peek()>= 'a' && ad.peek() <='z') return "invalid";
                            word.add(ad.poll());
                            if(ad.poll() != third) return "invalid";
                        }
                        if(ad.peek() >= 'a' && ad.peek() <='z') return "invalid";
                        word.add(ad.poll());
                        if(input)
                    }
                } else {

                }

            }

        } catch (Exception e) {
            return "invalid";
        }

        return answer;
    }
}
