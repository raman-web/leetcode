import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!seen.containsKey(target - nums[i]))
                seen.put(nums[i], i);
            else
                return new int[] { seen.get(target - nums[i]), i };
        }
        return null;
    }
}
