class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int temp=0;
        int i=0;
        int result=0;
        while(i<nums.length) {
            temp=0;
            if(nums[i]==1) {
                while(i<nums.length && nums[i]==1) {
                    temp+=1;
                    i+=1;
                }
                result=Math.max(result, temp);
            }
            else {
                i+=1;
            }
        }
        return result;
    }
}
