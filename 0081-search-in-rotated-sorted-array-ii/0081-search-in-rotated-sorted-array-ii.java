class Solution {
    public boolean search(int[] nums, int target) {
        return binarySearch(nums, target);
    }

    boolean binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (target == nums[mid])
                return true;
            else if (nums[left] == nums[right] && target!=nums[left]) {
                ++left;
                --right;
            } else if (nums[left] <= nums[mid])
                if (target >= nums[left] && target < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            else if (nums[mid] < target && nums[right] >= target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
}