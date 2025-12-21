class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int x: nums)
        sum+=x;
        //sum odd h to partition nhi kr skta
        if(sum % 2!=0)
        return false;
        
        int target=sum/2;
        //tabulation table
        boolean[][] t=new boolean[n+1][target+1];
        //initializ
        for(int i=0;i<=n;i++){
            t[i][0] =true;
            
        }
        for(int j=0;j<=target;j++){
                t[0][j] = false;
        }
        //choice diag
        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                if(nums[i-1]<=j){
                    t[i][j]=t[i-1][j-nums[i-1]] || t[i-1][j];
                }else{
                    t[i][j]=t[i-1][j];
                }
            }

        }
        return t[n][target];
        
    }
}