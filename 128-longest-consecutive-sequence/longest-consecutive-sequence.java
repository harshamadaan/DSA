class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
       HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<n;i++){
        set.add(nums[i]);
       }
        
        int max=1;
        for(int num:set){
            if(set.contains(num-1)){
                continue;
            }else{
                int currNum=num;
                int currSub=1;
                while(set.contains(currNum+1)){
                    currNum++;
                    currSub++;
                }
                 max=Math.max(max,currSub);
                
            }
           
        }
        return max;
        
    }
}