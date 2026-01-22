class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(nums,0,res);
        return res;
        
        
    }
    private void backtrack(int[] nums,int start,List<List<Integer>> res){
        //bc
        int m=nums.length;
        if(start==m){
            List<Integer> temp=new ArrayList<>();
            for(int n: nums)
            temp.add(n);
            res.add(temp);
            return;
        }
        for(int i=start;i<m;i++){
            swap(nums,start,i);
            backtrack(nums,start+1,res);
            //undo backtrack
            swap(nums,start,i);
        }

    }
    private void swap(int[] nums,int i, int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}