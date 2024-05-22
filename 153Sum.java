class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;

        for(int i=0; i<n; i++) {
            /* Remove duplicate values */
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k) {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>0) {
                    k--;
                } else if(sum<0) {
                    j++;
                } else {
                    List<Integer> temp=Arrays.asList(nums[i], nums[j], nums[k]);
                    res.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[k]==nums[k+1]) k--;  /* Remove duplicate values */
                    while(j<k && nums[j]==nums[j-1]) j++;  /* Remove duplicate values */
                }
            }
        }
        return res;
    }
}
