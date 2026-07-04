class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        for(int a:nums){
            sum+=a;

        }
        if(sum%k!=0) return false;
        int target=sum/k;
        int[] subset=new int[k];
        Arrays.sort(nums);  //easily bar bar add nhi krna pdaga
//         for(int l=0,r=n-1;l<r;l++,r--){
//     int temp=nums[l];
//     nums[l]=nums[r];
//     nums[r]=temp;
// }


        return dfs(nums,subset,n-1,target);
        
    }
    boolean dfs(int[]nums,int[]subset,int idx,int target){
        if(idx==-1) return true;
        for(int i=0;i<subset.length;i++){
            if(i>0 && subset[i]==subset[i-1]) continue;
            if(subset[i]+nums[idx]>target) continue;  //base case

            subset[i]+=nums[idx];  //yha rakh diya

            if(dfs(nums,subset,idx-1,target)){ //ab recursively dakhta jayaga
            return true; //mtlb shi h

            }
            subset[i]-=nums[idx];   //nhi to hta do glt position h
            if(subset[i]==0)
            break; 
        }
        return false;

    }
}