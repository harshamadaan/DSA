class Solution {
    static int[] t;
    public int rob(int[] nums) {
        int n=nums.length;
        
        t=new int[n];
        for(int i=0;i<n;i++){
            Arrays.fill(t,-1);
           
        }
        return solve(nums,0);
        
    }
    private int solve(int[]nums,int i){
        int n=nums.length;
        if(i>=n) return 0; //= is must otherwise access outofbound
        if(t[i]!=-1) return t[i];
        //rob
        int rob=nums[i]+solve(nums,i+2);
        //skip
        int skip=0+solve(nums,i+1);

        return t[i]=Math.max(rob,skip);
    }
}