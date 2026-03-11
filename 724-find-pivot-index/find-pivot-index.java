class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int rightSum=0;
        for(int i:nums){
            rightSum+=i;
        }
        int leftSum=0;
        for(int i=0;i<n;i++){
            rightSum-=nums[i];
            if(leftSum==rightSum){
                return i;
            }else{
                leftSum+=nums[i];
            }

        }
        return -1;

        
    }
}