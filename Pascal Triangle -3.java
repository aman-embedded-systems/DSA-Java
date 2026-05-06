class Solution {
    public List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row=1;row<=n;row++){
            ans.add(helper(row));
        }
        return ans;
    }
    private List<Integer> helper(int r){
        List<Integer> row = new ArrayList<>();
        long ans = 1;
        row.add(1);
        for(int col=1;col<r;col++){
            ans = ans*(r-col);
            ans = ans/col;
            row.add((int)ans);
        }
        return row;
    }
}
