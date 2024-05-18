class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int indPos=0, indNeg=1;
        int[] res=new int[n];
        for(int i=0; i<n; i++) {
            if(nums[i]<0) {
                res[indNeg]=nums[i];
                indNeg+=2;
            } else {
                res[indPos]=nums[i];
                indPos+=2;
            }
        }
        return res;
    }
}
