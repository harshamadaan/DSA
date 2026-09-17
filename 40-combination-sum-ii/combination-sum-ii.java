class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
       
        backtrack(target,res,new ArrayList<>(),0,candidates);
        return res;

        
    }

    public void backtrack(int target,List<List<Integer>> res,List<Integer> curr,int start,int[] candidates){
        if(target==0){
           res.add(new ArrayList<>(curr));
           return;
        }

        for(int i=start;i<candidates.length;i++){
            // skip dup
            if(i> start && candidates[i]==candidates[i-1]){
                continue;
            }
            // early termination
            if(target < 0){
                return;
            }
            curr.add(candidates[i]);
            backtrack(target-candidates[i],res,curr,i+1,candidates);
            curr.remove(curr.size()-1);
        }
    }
}