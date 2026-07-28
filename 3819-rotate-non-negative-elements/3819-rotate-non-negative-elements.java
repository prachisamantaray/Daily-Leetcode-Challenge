import java.util.*;

class Solution {
    public int[] rotateElements(int[] nums, int k) {
        List<Integer> nonNegative = new ArrayList<>();

        for (int num : nums) {
            if (num >= 0) {
                nonNegative.add(num);
            }
        }

        int m = nonNegative.size();
        if (m == 0) return nums;

        k %= m;

        List<Integer> rotated = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            rotated.add(nonNegative.get((i + k) % m));
        }

        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                nums[i] = rotated.get(idx++);
            }
        }

        return nums;
    }
}