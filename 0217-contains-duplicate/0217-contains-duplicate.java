class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(nums.length);
        for (int i : nums) {
            if (!set.add(i))
                return true;
        }
        return false;
    }
}