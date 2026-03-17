class Solution {
    public boolean isPerfectSquare(int num) {
        int l=1,h=num;
        while(l<=h){
            int mid=l+(h-l)/2;
            long squrd=(long)mid*mid;
            if(squrd==num){
                return true;
            }else if(squrd<num){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return false;
        
    }
}