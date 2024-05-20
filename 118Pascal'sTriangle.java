/* My Solution */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        if(numRows>0) {
            List<Integer> list0=new ArrayList<>();
            list0.add(1);
            res.add(list0);
        }
        if(numRows>1) {
            List<Integer> list1=new ArrayList<>();
            list1.add(1);
            list1.add(1);
            res.add(list1);
        }
        if(numRows>2) {
            helper(res, 2, numRows);
        }
        return res;
        
    }

    public static void helper(List<List<Integer>> res, int n, int numRows) {
        if(n>=numRows) return;
        List<Integer> temp=new ArrayList<>();
        temp.add(1);
        List<Integer> prevRow=res.get(n-1);
        for(int i=0; i<prevRow.size()-1; i++) {
            temp.add(prevRow.get(i)+prevRow.get(i+1));
        }
        temp.add(1);
        res.add(temp);

        helper(res, n+1, numRows);
    }
}

/* Combinatorial Solution */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=1; i<=numRows; i++) {
            res.add(pascRow(i));
        }
        return res;
    }

    List<Integer> pascRow(int rowInd) {
        int row=rowInd;
        List<Integer> temp=new ArrayList<>();
        long ans=1;
        temp.add((int) ans);
        for(int col=1; col<row; col++) {
            ans=ans*(row-col);
            ans=ans/col;
            temp.add((int) ans);
        }
        return temp;
    }
}
