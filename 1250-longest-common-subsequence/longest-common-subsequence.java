class Solution {
    static int[][] t;
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        t=new int[m+1][n+1];
        //initialize -1
        for(int i=0;i<=m;i++){
            Arrays.fill(t[i],-1);
        }
        return LCS(text1,text2,m,n);
        
    }
    public static int LCS(String text1, String text2,int m,int n){
        //base
        if(m==0|| n==0)
        return 0;

        //memorised check
        if(t[m][n]!=-1)
        return t[m][n];

        //choice diag
        if(text1.charAt(m-1)==text2.charAt(n-1)){
            t[m][n]=1+LCS(text1,text2,m-1,n-1);
        }else{
            t[m][n]=Math.max(LCS(text1,text2,m,n-1),LCS(text1,text2,m-1,n));
        }
        return t[m][n];
    }
}