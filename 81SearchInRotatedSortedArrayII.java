class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int left=0;
        int right=n-1;

        while(left<=right) {
            int mid=(left+right)/2;
            if(nums[mid]==target) return true;
            if(nums[left]==nums[mid] && nums[mid]==nums[right]) {
                left+=1;
                right-=1;
                continue;
            }
            if(nums[left]<=nums[mid]) {
                if(nums[left]<=target && nums[mid]>=target) {
                    right=mid-1;
                } else {
                    left=mid+1;
                }
            } else {
                if(nums[mid]<=nums[right]) {
                    if(target>=nums[mid] && target<=nums[right]) {
                        left=mid+1;
                    } else {
                        right=mid-1;
                    }
                }
            }
        }
        return false;
    }
}
