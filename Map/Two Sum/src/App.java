public class App {

    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {

            if (hm.containsKey(target - nums[i])) {
                answer[0] = hm.get(target - nums[i]);
                answer[1] = i;
                return answer;
            }

            hm.put(nums[i], i);
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
