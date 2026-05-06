class Solution {
    public int pascalTriangleI(int r, int c) {
        // n ---> row-1
        // k ---> col -1
        // nCk = n!/k!*(n-k)!
        int n =r-1;
        int k = c-1;
        long res = 1;
        for(int i=0;i<k;i++){
            res = res * (n-i);
            res = res/(i+1);
        }
        return (int)res ;

    }
}
