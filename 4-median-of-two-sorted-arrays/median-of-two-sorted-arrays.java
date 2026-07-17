class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;

        int total=m+n;
        int i=0,j=0;

        int prev=0;   // if even length hui to 2 val leni pdagi
        int curr=0;

        for(int count=0;count<=total/2;count++){
            prev=curr;  //new curr dundhna ke liya
            if(i<m && j<n){
                if(nums1[i]<nums2[j]){
                    curr=nums1[i];
                    i++;
                }else{
                    curr=nums2[j];
                    j++;
                }
            }else if(i<m){
                curr=nums1[i];
                i++;
            }else{
                curr=nums2[j];
                j++;
            }
            
        }

        if(total%2==1){
            return curr;
        }else{
            return (curr+prev)/2.0;
        }
        
    }
}