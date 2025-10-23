class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0;
        int zeroCount=0,res=0;
        int n=nums.length;
        while(j<n){
            if(nums[j]==0) zeroCount++;
            while(zeroCount>k) {
                if(nums[i]==0) zeroCount--;

                i++;
            }
            res=Math.max(res,j-i+1);
            j++;

        }
        return res;
        

        
    }
}