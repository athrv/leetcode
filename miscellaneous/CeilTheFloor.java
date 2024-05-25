/* Given an unsorted array Arr[] of N integers and an integer X, find the floor and ceiling of X in Arr[0..N-1].
The floor of X is the largest element that is smaller than or equal to X. The Floor of X doesn’t exist if X is smaller than the smallest element of Arr[].
The ceil of X is the smallest element that is greater than or equal to X. The Ceil of X doesn’t exist if X is greater than the greatest element of Arr[]. */

class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        // code here
        Arrays.sort(arr);
        int floor=-1;
        int ceil=-1;
        
        int left=0;
        int right=n-1;
        while(left<=right) {
            int mid=(left+right)/2;
            if(arr[mid]<=x) {
                floor=arr[mid];
                left=mid+1;
            } else {
                right=mid-1;
            }
        }
        
        left=0;
        right=n-1;
        while(left<=right) {
            int mid=(left+right)/2;
            if(arr[mid]>=x) {
                ceil=arr[mid];
                right=mid-1;
            } else {
                left=mid+1;
            }
        }
        
        return new Pair(floor, ceil);
    }
}
