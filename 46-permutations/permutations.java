class Solution {
    void backtrack(int[]nums,List<List<Integer>> result,List<Integer> temp){
        if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i])){
                continue;
            }
            temp.add(nums[i]);
            backtrack(nums,result,temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
         List<Integer> temp=new ArrayList<>();

        // for(int i=nums.length;i>=1;i--){
        //     if(nums.length==1 || nums.length==0){
        //         n=1;
        //     }
        //     int n=nums.length;
        //     n=n*(n-1);

        // }
        backtrack( nums,result,temp);
        return result;
    }
}