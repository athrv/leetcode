class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> res=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1; i>=0; i--) {
            if(arr[i]>=max) {
                max=arr[i];
                res.add(arr[i]);
            } else {
                continue;
            }
        }
        Collections.reverse(res);
        return res;
    }
}
