class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
         int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            if(num<min) min=num;
            if(num>max) max=num;
        }
        List<Integer> ans=new ArrayList<>();
        Set<Integer> set=new HashSet<>();

        for(int num:nums){
            set.add(num);

            
        } 

        for(int i=min;i<=max;i++){
                if(!set.contains(i)){
                    ans.add(i);
                }
         }
        return ans;

        
    }
}