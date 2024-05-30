class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=Arrays.stream(piles).max().getAsInt();
        int cost=h;
        while(left<=right) {
            int mid=(left+right)/2;
            if(cost(piles, mid, h)) {
                right=mid-1;
            } else {
                left=mid+1;
            }
        }
        return left;
    }

    public boolean cost(int[] piles, int rate, int h) {
        int totalCost=0;
        for(int pile : piles) {
            totalCost+=Math.ceil((double)pile/rate);
        }
        return totalCost <= h;
    }
}
