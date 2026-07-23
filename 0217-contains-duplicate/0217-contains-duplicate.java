class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        if (n < 2)
            return false;
        HashSet<Integer> set = new HashSet<>(n);
        for (int i : nums) {
            if (!set.add(i))
                return true;
        }
        return false;
    }
}