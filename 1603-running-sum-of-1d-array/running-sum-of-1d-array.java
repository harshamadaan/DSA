class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=1;i<n;i++){
            sum=nums[i]+nums[i-1];
            nums[i]=sum;  // i start from 1 so ist elemnt of that will copy that it will change from 2nd one
        }
        return nums;
        
    }
}