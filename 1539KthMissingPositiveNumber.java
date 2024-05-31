class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<=right) {
            int mid=(left+right)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k) left=mid+1;
            else right=mid-1;
        }
        return right+1+k; // left+k
    }
}
