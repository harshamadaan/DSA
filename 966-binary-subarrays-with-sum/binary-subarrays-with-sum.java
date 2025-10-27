class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return solve(nums,goal)-solve(nums,goal-1);
    }
    private int solve(int[] nums,int goal){
        if(goal<0) return 0;   //when we do goal-1 in return statem then it become -ve
        int n=nums.length;
        int i=0,j=0;
        int count=0,sum=0;
        while(j<n){
            sum+=nums[j];
            while(sum>goal){
                sum-=nums[i];
                i++;
            }
            count+=j-i+1;
            j++;
        }
        return count;
    }
}