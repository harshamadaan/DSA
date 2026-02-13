class Solution {
    public int minLength(int[] nums, int k) {
        int n=nums.length;
        int i=0,j=0;
        int min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        while(j<n){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            if(map.get(nums[j])==1){
                sum+=nums[j];
            }
            // shrink after satisfy
            while(sum>=k){
                min=Math.min(min,j-i+1);

                //remove
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                   sum-=nums[i]; 
                }
               i++; 
            }
            j++;
        }
        return min==Integer.MAX_VALUE?-1:min;
        
        
    }
}