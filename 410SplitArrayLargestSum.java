class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int left=Integer.MIN_VALUE;
        int right=0;
        for(int i=0; i<n; i++) {
            left=Math.max(left, nums[i]);
            right+=nums[i];
        }
        while(left<=right) {
            int mid=(left+right)/2;
            int partitions=getK(nums, mid, n);
            if(partitions<=k) {
                right=mid-1;
            } else {
                left=mid+1;
            }
        }
        return left;
    }

    public static int getK(int[] arr, int capacity, int n) {
        int cap=0;
        int k=1;
        for(int i=0; i<n; i++) {
            if(cap+arr[i]<=capacity) {
                cap+=arr[i];
            } else {
                k++;
                cap=arr[i];
            }
        }
        return k;
    }
}
