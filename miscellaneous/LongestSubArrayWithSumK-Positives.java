class Solution{
  
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        int l=0;
        int r=0;
        long sum=A[0];
        int maxLen=0;
        while(r<N) {
            while(l<=r && sum>K) {
                sum-=A[l];
                l++;
            }
            if(sum==K) {
                maxLen=Math.max(maxLen, r-l+1);
            }
            r++;
            if(r<N) sum+=A[r];
        }
        return maxLen;
    }
}
