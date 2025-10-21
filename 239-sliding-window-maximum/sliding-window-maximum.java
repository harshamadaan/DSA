class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int [] ans=new int[n-k+1];
        int i=0,j=0;
        Deque<Integer> deque=new LinkedList<>();
        while(j<n){
            if(deque.size()==0){
                deque.add(nums[j]);
            }
            else{
                while(deque.size()>0 && deque.peekLast()<nums[j]){
                deque.removeLast();
                }
                deque.add(nums[j]);
            }

            if(j-i+1==k){
                ans[i]=deque.peek();
                if(deque.peek()==nums[i]){
                deque.removeFirst();
                }
                i++;
                j++;
            }else{
                j++;
            }
            
            
        }
        return ans;
        
    }
}