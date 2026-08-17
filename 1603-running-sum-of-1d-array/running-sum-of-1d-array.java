class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int [] arr=new int[nums.length];

            for(int j=0;j<nums.length;j++){
                    sum=sum+nums[j];
                    arr[j]=sum;
            }
        
        return arr;
    }
}