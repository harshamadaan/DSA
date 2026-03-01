class Solution {
    private boolean isvalid(int[] nums, int k,int maxAllowedSum){
        int count=1;
        int currentSum=0;
        for(int i=0;i<nums.length;i++){
            if(currentSum + nums[i]<=maxAllowedSum){
                currentSum+=nums[i];
            }else{
                count++;
                currentSum=nums[i];
            }
        }
        return count<=k;
     }
    public int splitArray(int[] nums, int k) {
        int l=0,h=0;
        for(int i=0;i<nums.length;i++){
            l=Math.max(l,nums[i]);
            h+=nums[i];
        }
        while(l<=h){
            int mid=l+(h-l)/2;
            int ans=-1;
            if(isvalid(nums,k,mid)){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;

    }
}