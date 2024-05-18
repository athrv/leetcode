class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        int longest=1;
        if(n==0) return 0;
        for(int i=0; i<n; i++) {
            set.add(nums[i]);
        }
        for(int el:set) {
            if(!set.contains(el-1)) {
                int cnt=1;
                int x=el;
                while(set.contains(el+1)) {
                    cnt++;
                    el++;
                }
                longest=Math.max(longest, cnt);
            } 
        }
        return longest;
    }
}
