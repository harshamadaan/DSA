class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int idx=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[idx]=nums[i];
                idx++;
            }
            
        }
        for(int i=idx;i<n;i++){
                nums[i]=0;
            }
        
    }
}