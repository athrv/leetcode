/* Prefix Sum */

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map=new HashMap<>();
        int count=0;
        int prefixSum=0;
        map.put(0, 1);
        for(int i=0; i<nums.length; i++){
            prefixSum+=nums[i];
            // calculate remaining part (x-k) needed 
            int rem=prefixSum-k;
            // if remaining part available, add its count
            count+=map.getOrDefault(rem, 0);
            // update/add
            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }
        return count;
    }
}
