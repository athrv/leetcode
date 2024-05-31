class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int minCap=Integer.MIN_VALUE;
        int maxCap=0;
        for(int i=0; i<n; i++) {
            minCap=Math.max(minCap, weights[i]);
            maxCap+=weights[i];
        }
        while(minCap<=maxCap) {
            int mid=(minCap+maxCap)/2;
            if(possible(weights, mid, days, n)) {
                maxCap=mid-1;
            } else {
                minCap=mid+1;
            }
        }
        return minCap;
    }

    public boolean possible(int[] weights, int capacity, int days, int n) {
        int cap=0;
        int calcDays=1;
        for(int i=0; i<n; i++) {
            if(cap+weights[i]<=capacity) {
                cap+=weights[i];
            } else {
                calcDays+=1;
                cap=weights[i];
            }
        }
        return calcDays<=days;
    }
}
