class Solution {
    static int[] t;
    public int climbStairs(int n) {
        t=new int[n+1];
        
        Arrays.fill(t,-1);
        return solve(n);
        
        
    }
    private int solve(int n){
        if(n==0 || n==1) return 1;
        if(n==2) return 2;
        if(t[n]!=-1) return t[n];
        return t[n]=solve(n-1)+solve(n-2);

    }
}