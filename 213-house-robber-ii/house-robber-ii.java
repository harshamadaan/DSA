class Solution {
    static int[] t;
    public int rob(int[] nums) {
        int n=nums.length;
        //bc
        if (n == 1) return nums[0];
        //circle so cant rob ist and last simultaneously 
        // so ist 0to n-2
        t=new int[n];
        Arrays.fill(t,-1);
        int case1=solve(nums,0,n-2);

        //case2
        t=new int[n];
        Arrays.fill(t,-1);
        int case2=solve(nums,1,n-1);

        return Math.max(case1,case2);
        
    }
    private int solve(int[]nums,int i,int end){
        // int n=nums.length;
        if(i>end) return 0;
        if(t[i]!=-1) return t[i];
        int rob=nums[i]+solve(nums,i+2,end);
        int skip=0+solve(nums,i+1,end);
        return t[i]=Math.max(rob,skip);
    }
}