class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int requirement=target-nums[i];
            if(map.containsKey(requirement)) {
                return new int[] {map.get(requirement), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}
