/* Kadane's Algorithm */
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        long maxSum=Long.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            sum+=nums[i];
            if(sum>maxSum) {
                maxSum=sum;
            }
            if(sum<0) {
                sum=0;
            }
        }
        return (int) maxSum;
    }
}

/* Printing the Subarray */
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        long maxSum=Long.MIN_VALUE;
        int start=0; 
        int ansStart=-1, ansEnd=-1;
        for(int i=0; i<nums.length; i++) {
            if(sum==0) start=i;
            sum+=nums[i];
            if(sum>maxSum) {
                maxSum=sum;
                ansStart=start;
                ansEnd=i;
            }
            if(sum<0) {
                sum=0;
            }
        }
        return (int) maxSum;
    }
}
