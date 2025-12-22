class Solution {
    public int coinChange(int[] coins, int amount) {
        //base
        int n=coins.length;
        int INF=Integer.MAX_VALUE-1;
        int[][] t=new int[n+1][amount+1];
        //init
        for(int j=1;j<=amount;j++)
        t[0][j]=INF;  // no coins
        for(int i=0;i<=n;i++)
        t[i][0]=0;   //sum=0

        //init for 1st coin
        for(int j=1;j<=amount;j++){
            if(j%coins[0]==0){
                t[1][j]=j/coins[0];
            }else{
                t[1][j]=INF;
            }
        }
        //dp table filling
        for(int i=2;i<=n;i++){
            for(int j=1;j<=amount;j++){
                if(coins[i-1]<=j){
                    t[i][j]=Math.min(1+ t[i][j-coins[i-1]] , t[i-1][j]);
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return(t[n][amount] >=INF)? -1: t[n][amount];
        
    }
}