/* My solution */
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=i) {
                return i;
            }
        }
        return nums.length;
    }
}

/* Optimal Solution */
class Solution {
    public int missingNumber(int[] nums) {
      int  allxor=0;
       for(int i=0;i<=nums.length;i++){
        allxor=allxor^i;
        }
        for(int num:nums){
            allxor=allxor^num;
        }
        return allxor;
    }
}
