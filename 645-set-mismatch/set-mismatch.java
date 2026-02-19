class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        boolean[] arr =new boolean[n+1];
        int[] res={0,0};
        for(int num:nums){
            if(arr[num]==true){
                res[0]=num;
            }else{
                arr[num]=true;
            }
        }
        for(int i=1;i<=n;i++){
            if(arr[i]==false)
            res[1]=i;

        }
        return res;
        
    }
}