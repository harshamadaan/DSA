class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;

        List< List<Integer>> res=new ArrayList<>();

        Arrays.sort(nums);
        // assign pointer

        for(int i=0;i<n-2;i++){

            if(i>0 && nums[i]==nums[i-1]){  // so triplet do not come duplicate in op
                continue;
            }
            int l=i+1;
            int r=n-1;

            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0){
                    List<Integer> triplet=new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[l]);
                    triplet.add(nums[r]);

                    res.add(triplet);
                    // same here for duplicate
                    while(l<r && nums[l]==nums[l+1]){
                        l++;
                    }
                    while(l<r &&nums[r]==nums[r-1]){
                       r--;
                    }



                    l++;
                    r--;
                }else if(sum<0){
                    l++;
                }else{
                    r--;
                }
            }
           
        }
         return res;
        
    }
}