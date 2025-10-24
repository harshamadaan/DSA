// class Solution {
//     public int subarraysWithKDistinct(int[] nums, int k) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         int i=0,j=0;
//         int count=0;
//         int n =nums.length;
//         while(j<n){
//             map.put(nums[j],map.getOrDefault(nums[j],0)+1);
//             while(map.size()>k){
//                 map.put(nums[i],map.get(nums[i])-1);
//                 if(map.get(nums[i])==0) map.remove(nums[i]);
//                 i++;
//             }
//             count=count+(j-i+1);
//             j++;

//         }
//         return count;
        
//     }
    
// }

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return slidingWindow(nums, k) - slidingWindow(nums, k - 1);
    }

    // helper method that counts subarrays with at most k distinct numbers
    private int slidingWindow(int[] nums, int k) {
        if (k < 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0, count = 0;

        while (j < nums.length) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            while (map.size() > k) {
                map.put(nums[i], map.get(nums[i]) - 1);
                if (map.get(nums[i]) == 0) map.remove(nums[i]);
                i++;
            }

            count += (j - i + 1);
            j++;
        }
        return count;
    }
}
