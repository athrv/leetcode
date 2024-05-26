class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int left=0;
        int right=n-1;
        int min=Integer.MAX_VALUE;
        int ind=-1;

        while(left<=right) {
            int mid=(left+right)/2;
            if(arr[left]<=arr[right]) {
                if(arr[left]<min) {
                    ind=left;
                    min=arr[left];   
                }
                break;
            } 
            if(arr[mid]>=arr[left]) { // left part sorted, skip it
                if(arr[left]<min) {
                    ind=left;
                    min=arr[left];
                }
                left=mid+1;
            } else { // right part sorted, skip it
                if(arr[mid]<min) {
                    ind=mid;
                    min=arr[mid];
                }
                right=mid-1;
            }
        }
        return ind;
    }
}
