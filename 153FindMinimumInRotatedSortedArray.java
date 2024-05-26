class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int min=Integer.MAX_VALUE;

        while(left<=right) {
            int mid=(left+right)/2;
            if(nums[mid]>=nums[left] && nums[mid]<=nums[right]) {
                min=Math.min(nums[left], min);
                right=mid-1;
            } else if(nums[mid]>=nums[left] && nums[mid]>=nums[right]) {
                min=Math.min(nums[left], min);
                left=mid+1;
            } else {
                min=Math.min(nums[mid], min);
                right=mid-1;
            }
        }
        return min;
    }
}
