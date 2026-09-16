class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n=candidates.length;
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();
        backtrack(target,res,comb,0,candidates);
        return res;
        
    }
    private void backtrack(int target,List<List<Integer>> res,List<Integer>comb,int start,int[] candidates){
        int n=candidates.length;
        if(target==0){
            res.add(new ArrayList<>(comb));
            
        }else if(target <0){
            return;
        }

        for(int i=start;i<n;i++){
            comb.add(candidates[i]);
            backtrack(target-candidates[i],res,comb,i,candidates);
            comb.remove(comb.size()-1);
        }
    }
}