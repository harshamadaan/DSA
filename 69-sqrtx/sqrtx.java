class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int l=1,h=x;
        int res=1;
        while(l<=h){
            int mid=l+(h-l)/2;
            long squrd=(long)mid*mid;
        if(squrd==x){
            return mid;
        }else if(squrd<x){
            res=mid;
            l=mid+1;
        }else{
            h=mid-1;
        }
        }
        return res;

        
        
    }
}