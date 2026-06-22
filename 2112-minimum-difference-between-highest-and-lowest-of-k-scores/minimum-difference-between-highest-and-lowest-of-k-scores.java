class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        if(k==1) return 0;
        Arrays.sort(nums);
        int minDiff=Integer.MAX_VALUE;
        int i=0,j=k-1;
        while(j<n){
            int min=nums[i];
            int max=nums[j];
            int diff=max-min;
            minDiff=Math.min(minDiff,diff);
            i++;
            j++;
        }
        return minDiff;
    }
}