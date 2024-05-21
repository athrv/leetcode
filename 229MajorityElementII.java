/* Extended Moore's Voting Algorithm */
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int el1=Integer.MIN_VALUE; 
        int el2=Integer.MIN_VALUE;
        int cnt1=0, cnt2=0;
        for(int i=0; i<n; i++) {
            if(cnt1==0 && nums[i]!=el2) {
                cnt1=1;
                el1=nums[i];
            } else if(cnt2==0 && nums[i]!=el1) {
                cnt2=1;
                el2=nums[i];
            } else if(nums[i]==el1) cnt1++;
            else if(nums[i]==el2) cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }

        List<Integer> res=new ArrayList<>();
        cnt1=0; cnt2=0;
        for(int i=0; i<n; i++) {
            if(nums[i]==el1) {
                cnt1++;
            } else if(nums[i]==el2) {
                cnt2++;
            }
        }

        int min=(n/3)+1;
        if(cnt1>=min) res.add(el1);
        if(cnt2>=min) res.add(el2);

        return res;
    }
}
