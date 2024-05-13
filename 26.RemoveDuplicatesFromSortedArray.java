class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        while(j<nums.length) {
            if(nums[i]==nums[j]) {
                j+=1;
            }
            else {
                i+=1;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
