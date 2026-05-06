class Solution {
    public int[] pascalTriangleII(int r) {
        int n = r-1;
        int res = 1;
        List<Integer>ans = new ArrayList<>();
        ans.add(1);
        for(int i=0;i<n;i++){
            res = res * (n-i);
            res = res / (i+1);
            ans.add(res); 
        }
        int[] row = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            row[i] = ans.get(i);
        }
        return row;
    }
}
