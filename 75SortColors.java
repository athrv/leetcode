/* Two Pointer Solution */
class Solution {
    public void sortColors(int[] nums) {
        sorter(nums, 0, 0);
    }

    public static void sorter(int[] nums, int num, int ind) {
        int i=ind;
        while(i<nums.length && nums[i]==num) {
            i++;
        }
        int j=i+1;
        while(j<nums.length && num<3) {
            if(nums[j]!=num) {
                j+=1;
            } else {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
        }
        if(num<3 && i<nums.length) sorter(nums, ++num, i);
    }
}

/* Dutch Flag Algorithm */
class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high) {
            if(nums[mid]==0) {
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            } else if(nums[mid]==1) {
                mid++;
            } else {
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }
    }
}
