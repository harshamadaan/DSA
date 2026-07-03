class Solution {
    int[]t;
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        t=new int[n+1];
      // start pointer
      for(int i=1;i<n;i++){
        for(int j=0;j<i;j++){
             if(nums[i]>nums[j]){
                if(t[j]+1 > t[i]){
                    t[i]=t[j]+1;
                }
             }
        }
        
      }
       int max=0;
        for(int i=0;i<n;i++){
            if(t[i]>t[max]){
                t[max]=t[i];
            }
        }
        return t[max]+1; 
    }
}