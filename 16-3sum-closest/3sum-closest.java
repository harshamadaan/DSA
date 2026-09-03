class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int res=0;
        int minDiff=Integer.MAX_VALUE;

        for(int i=0;i<n-2;i++){
            int l=i+1,r=n-1;

            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                    if(Math.abs(sum-target)<minDiff){
                        minDiff=Math.abs(sum-target);
                        res=sum;
                    }else if(Math.abs(sum-target)==minDiff){
                        res=Math.max(res,sum);


                    }if(sum<target){
                        l++;
                    }else{
                        r--;
                    }
                

            }
            
        }
        return res;
        
    }
}