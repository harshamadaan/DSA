class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        int n=arr.length;
        int peak=0;
        for(int i=1;i<n-1;i++){
        int prev=i-1;
        int curr=i;
        int next=i+1;
        
        if(arr[prev]==arr[curr] || arr[curr]==arr[next]) return false;
        if(arr[prev]>arr[curr] &&arr[curr]<arr[next]){
            return false;

        }
        if(arr[prev]<arr[curr ]&& arr[curr]>arr[next]){
            peak++;
            if(peak>1){
                return false;
            }
        }

        }
        return peak==1;
        
        
    }
}