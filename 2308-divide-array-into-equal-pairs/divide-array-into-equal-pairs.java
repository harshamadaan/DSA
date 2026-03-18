class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length;
        int[] freq=new int[501];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        for(int f:freq){
            if(f%2!=0)
            return false;
        }
        return true;

        
    }
}