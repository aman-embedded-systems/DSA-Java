class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        // List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            int j = i+1;
            int k =  n - 1;
            while(j<k){
               sum = nums[i] + nums[j] + nums[k];
                if(sum<0){
                j++;
            }
            else if(sum > 0){
                k--;
            }
            else{
                List<Integer>temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[j]);
                temp.add(nums[k]);
                set.add(temp);
                j++;
                k--;
            }
            }  
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
}
