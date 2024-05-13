class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        while(j<nums.length) {
            if(nums[j]!=0) {
                i+=1;
                j+=1;
            } else {
                while(j<nums.length && nums[j]==0) {
                    j+=1;
                }
                if(j<nums.length) {
                    nums[i]=nums[j];
                    nums[j]=0;
                    i+=1;
                }
            }
        }
    }
}
