class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long val=(long)m*k;
        int n=bloomDay.length;
        if(val>n) return -1;
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            min=Math.min(min, bloomDay[i]);
            max=Math.max(max, bloomDay[i]);
        }

        while(min<=max) {
            int mid=(min+max)/2;
            if(possible(bloomDay, mid, m, k)) {
                max=mid-1;
            } else {
                min=mid+1;
            }
        }
        return min;
    }

    public boolean possible(int[] bloomDay, int day, int m, int k) {
        int count=0;
        int noB=0;
        for(int i=0; i<bloomDay.length; i++) {
            if(bloomDay[i]<=day) {
                count++;
            } else {
                noB+=(count/k);
                count=0;
            }
        }
        noB+=count/k;
        return noB>=m;
    }
}
