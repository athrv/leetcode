class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        int n=nums.length;
        
        // step 1: find the break point
        for(int i=n-2; i>=0; i--) {
            if(nums[i]<nums[i+1]) {
                ind=i;
                break;
            }
        }

        if(ind==-1) {
            reverse(nums, 0);
        } else {

            // step 2: find the next smallest element and swap
            for(int i=n-1; i>ind; i--) {
                if(nums[i]>nums[ind]) {
                    swap(nums, ind, i);
                    break;
                }
            }

            // step 3: reverse the right half
            reverse(nums, ind+1);
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    void reverse(int[] nums, int start) {
        int i=start;
        int j=nums.length-1;
        while(i<j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
