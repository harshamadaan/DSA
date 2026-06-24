class Solution {
    public boolean check(int[] nums) {
        int deviation=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i<n-1 && nums[i]>nums[i+1]){
                deviation++;
            }else if(i==n-1 && nums[n-1]>nums[0]){
                deviation++;
            }
        }
        return (deviation > 1)? false:true;
        
    }
}