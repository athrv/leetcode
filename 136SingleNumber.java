class Solution {
    public int singleNumber(int[] nums) {
        return xor(0, nums);
    }
    public static int xor(int x, int[] nums) {
        if(x>=nums.length) {
            return 0;
        }
        return nums[x]^xor(x+1, nums);
    }
}
