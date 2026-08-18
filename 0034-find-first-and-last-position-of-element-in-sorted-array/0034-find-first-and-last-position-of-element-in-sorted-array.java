class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0)
            return new int[] { -1, -1 };
        return new int[] { getTargetIndexUsingBinarySearch(nums, target, true),
                getTargetIndexUsingBinarySearch(nums, target, false) };
    }

    public int getTargetIndexUsingBinarySearch(int[] nums, int target, boolean lookForFirstOccurance) {
        int left = 0;
        int right = nums.length - 1;
        int mid, index = -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (target == nums[mid]) {
                if (lookForFirstOccurance){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
                index = mid;
            } else if (target > nums[mid])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return index;
    }
}