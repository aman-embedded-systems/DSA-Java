class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int a = j+1;
                int b = n-1;
                while(a<b){
                    int sum = nums[i] + nums[j] + nums[a] + nums[b];
                    if(sum < target){
                        a++;
                    }
                    else if(sum > target){
                        b--;
                    }
                    else{
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[a]);
                        temp.add(nums[b]);
                        set.add(temp);
                        a++;
                        b--;

                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;

            
    }
}
