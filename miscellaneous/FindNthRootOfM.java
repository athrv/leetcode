// You are given 2 numbers (n , m); the task is to find n√m (nth root of m).

class Solution
{
    public int NthRoot(int n, int m)
    {
        // code here
        int left=1;
        int right=m;
        while(left<=right) {
            int mid=(left+right)/2;
            int val=func(mid, n, m);
            if(val==1) return mid;
            else if(val==2) {
                right=mid-1;
            } else {
                left=mid+1;
            }
        }
        return -1;
    }
    
    public int func(int mid, int n, int m) {
        long ans=1;
        for(int i=1; i<=n; i++) {
            ans=ans*mid;
            if(ans>m) return 2;
        }
        if(ans==m) return 1;
        return 0;
    }
}
