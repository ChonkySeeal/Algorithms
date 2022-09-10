import java.util.*;

public class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> l = new ArrayList<>();
        int temp = -1;
        for (int i : arr) {
            if (temp != i) {
                l.add(i);
                temp = i;
            }
        }

        return l;
    }

}