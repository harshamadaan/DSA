class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        List<List<Integer>> res= new ArrayList<>();
        boolean[] used=new boolean[n];
        backtrack(res,new ArrayList<>(),nums,used);
        return res;
        
    }

    private void backtrack(List<List<Integer>> res,List<Integer> curr,int[]nums,boolean[] used){
        //bc
        int n=nums.length;
        if(curr.size()==n){
            res.add(new ArrayList<>(curr));
            return;
        }

        // nhi to 
        for(int i=0;i<n;i++){
            if(!used[i]){
                curr.add(nums[i]);
                used[i]=true;

                backtrack(res,curr,nums,used);
                used[i]=false;
                curr.remove(curr.size()-1);
            }
        }
    }
}