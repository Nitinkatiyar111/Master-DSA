package BasicHashing;
import java.util.HashMap;
import java.util.Map;

public class SecondHighest {

    public static int secondHighest(int[] nums) {
    Map<Integer, Integer> freq = new HashMap<>();
    for (int num : nums)
        freq.put(num, freq.getOrDefault(num,0)+1);

    int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
    for (int f : freq.values()) {
        if (f > max) {
            second = max;
            max = f;
        } else if (f < max && f > second) {
            second = f;
        }
    }

    int res = Integer.MAX_VALUE;
    for (Map.Entry<Integer,Integer> e : freq.entrySet()) {
        if (e.getValue() == second) {
            res = Math.min(res, e.getKey());
        }
    }
    return res == Integer.MAX_VALUE ? -1 : res;
}

    public static void main(String[] args) {
        int[] nums = {4, 4, 5, 5, 6, 7, 9, 10};
        int result = secondHighest(nums);
        System.out.println(result);  // Expected output: 5
    }
}
