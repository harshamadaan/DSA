
class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int total=0;
        int left=0;
        int right=n-1;
        int leftMax=height[0];
        int rightMax=height[n-1];
        while(left<right){
            if(height[left]<height[right]){
                 leftMax=Math.max(leftMax,height[left]);
                    if(leftMax-height[left]>0){
                        total+=leftMax-height[left];
                    }
                    left++;
                
            }else{
                 rightMax=Math.max(rightMax,height[right]);
                    if(rightMax-height[right]>0){
                        total+=rightMax-height[right];
                    }
                    right--;
                
            }
        }
        return total;
        
    }
}



// class Solution {
//     public int trap(int[] height) {
//         int[] left=maxToLeft(height);
//         int[] right=maxToRight(height);
//         int totalWater=0;
//         int n=height.length;
        
//         for(int i=0;i<n;i++){
//             totalWater+=Math.min(left[i],right[i])-height[i];
//         }
//         return totalWater;

//     }
//     public int[] maxToLeft(int[] height){
//         int n=height.length;
//         int[] left=new int[n];
//         int max=height[0];
//         left[0]=max;
//         for(int i=1;i<n;i++){
//             max=Math.max(max,height[i]);
//             left[i]=max;
//         }
//         return left;
//     }

//     public int[] maxToRight(int[] height){
//         int n=height.length;
//         int[] right=new int[n];
//         int max=height[n-1];
//         right[n-1]=max;
//         for(int i=n-2;i>=0;i--){
//             max=Math.max(max,height[i]);
//             right[i]=max;
//         }
//         return right;
//     }
// }