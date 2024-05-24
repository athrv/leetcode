class Solution {
    public int search(int[] nums, int target) {
        return helper(nums, 0, nums.length-1, target);
    }

    public int helper(int[] nums, int start, int end, int target) {
        if(start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(nums[mid] == target) {
            return mid;
        } else if(target > nums[mid]) {
            return helper(nums, mid + 1, end, target); 
        } else {
            return helper(nums, start, mid - 1, target); 
        }
    }
}
