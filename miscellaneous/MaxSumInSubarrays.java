/* Given an array Arr, with indexes running from 0 to N, select any two indexes, i and j such that i<=j-1. From subarray Arr[i...j], 
find the two smallest numbers and add them, you will get score for that subarray. Your task is to return maximum score possible in the given array Arr. */

class Solution {
    public static long pairWithMaxSum(long arr[], long N)
    {
        // Your code goes here
        if(N<2) return -1;
        long sum=arr[0]+arr[1];
        for(int i=1; i<N-1; i++) {
            long res=arr[i]+arr[i+1];
            sum=Math.max(res, sum);
        }
        return sum;
    }
}

/* Solution link - https://www.geeksforgeeks.org/maximum-sum-of-smallest-and-second-smallest-in-an-array/ */
