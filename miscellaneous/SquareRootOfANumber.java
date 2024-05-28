// Function to find square root in O(logn)
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
		long left=1;
		long right=x;
		long result=-1;
		while(left<=right) {
		    long mid=(left+right)/2;
		    long val=mid*mid;
		    if(val<=x) {
                result=mid;
                left=mid+1;
		    } else {
		        right=mid-1;
		    }
		}
		return result;
	 }
}
