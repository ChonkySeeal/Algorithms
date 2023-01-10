import java.util.HashMap;;

public class Solution {
    static String[] d;
    static boolean[] visited = new boolean[8];
    static int[] chs = new int[8];
    static HashMap<Character, Integer> hm = new HashMap<>();
    static int answer = 0;

    public int solution(int n, String[] data) {
        hm.put('A', 0);
        hm.put('C', 1);
        hm.put('F', 2);
        hm.put('J', 3);
        hm.put('M', 4);
        hm.put('N', 5);
        hm.put('R', 6);
        hm.put('T', 7);
        d = data;
        dfs(0);
        return answer;
    }

    public void dfs(int idx) {
        if (idx == 8) {
            if (check())
                answer++;
        } else {
            for (int i = 0; i < 8; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    chs[idx] = i;
                    dfs(idx + 1);
                    visited[idx] = false;
                }
            }
        }
    }

    public boolean check() {
        int x, y, dis;
        char op;
        for (String checklist : d) {
            x = chs[hm.get(checklist.charAt(0))];
            y = chs[hm.get(checklist.charAt(2))];
            op = checklist.charAt(3);
            dis = checklist.charAt(4) - '0' + 1;
            if (Math.abs(x - y) != dis && op == '=')
                return false;
            else if (Math.abs(x - y) <= dis && op == '>')
                return false;
            else if (Math.abs(x - y) >= dis && op == '<')
                return false;
        }
        return true;
    }

}
