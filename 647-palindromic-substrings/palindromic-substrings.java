class Solution {
    public int countSubstrings(String s) {
        int totalcount=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            //odd
            int j=i;
            int oddAns=expand(s,i,j);

            //even
            j=i+1;
            int evenAns=expand(s,i,j);
            totalcount+=oddAns+evenAns;
        }
        return totalcount;
        
    }
    public static int expand(String s,int i,int j){
        int count=0;
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            count++;
            i--;
            j++;
        }
        return count;

    }
}