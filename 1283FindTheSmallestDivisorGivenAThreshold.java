class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1;
        int right=Arrays.stream(nums).max().getAsInt();
        while(left<=right) {
            int mid=(left+right)/2;
            if(sumDiv(nums, mid, threshold)) {
                right=mid-1;
            } else {
                left=mid+1;
            }
        }
        return left;
    }

    public boolean sumDiv(int[] nums, int div, int threshold) {
        int total=0;
        for(int num:nums) {
            total+=(num+div-1)/div;
        }
        return total<=threshold;
    }
}
