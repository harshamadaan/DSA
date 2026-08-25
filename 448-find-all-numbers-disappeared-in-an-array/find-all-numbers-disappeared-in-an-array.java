class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> res=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(!map.containsKey(i)){
                res.add(i);

            }
        }
        return res;

        
        
    }
}