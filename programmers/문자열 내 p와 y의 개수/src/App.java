public class App {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        for(Character ele : s.toLowerCase().toCharArray()) {
            if(ele.equals('y'))
                yCount++;
            if(ele.equals('p'))
                pCount++;
        }

        return pCount == yCount;
    }
}
