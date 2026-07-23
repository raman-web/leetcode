class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        if (n < 2)
            return false;
        HashSet<Integer> set = new HashSet<>(n);
        for (int i : nums) {
            set.add(i);
        }
        return set.size()<n;
    }
}