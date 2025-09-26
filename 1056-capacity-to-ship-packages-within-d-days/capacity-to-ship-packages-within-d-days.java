class Solution {
    private boolean isvalid(int[] weights, int days,int maxAllowedWeights){ //..
        int requiredDays=1;    //...
        int currentWeight=0;
        
        for(int i=0;i < weights.length;i++){
            if(currentWeight + weights[i]<=maxAllowedWeights){
                currentWeight+=weights[i];
            }
            else{

                requiredDays++;
                currentWeight=weights[i];
            }
        }
        return requiredDays<=days;
    }
    public int shipWithinDays(int[] weights, int days) {

        int l=0,h=0;
        for(int i=0;i< weights.length;i++){  //..

        l=Math.max(l,weights[i]);    //...
        h+=weights[i];
        }

        while(l<=h){
            int mid=l+(h-l)/2;
            int ans=-1;
            if(isvalid(weights,days,mid)){   //
                ans=mid;
                h=mid-1;
            }else
            {
                l=mid+1;
            }
        }
        return l;
    }
}