class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int i=0,j=0;
        int count=0;
        int[] charCount=new int[3];  //array bna liya a,b,c, ki freq ki store k liya
        while(j<n){
            charCount[s.charAt(j) - 'a']++;//a convert ascii into 0,1,2 a[0]=0...1 kr do freq
            while(charCount[0]>0 && charCount[1]>0 &&charCount[2]>0){
                count+=(n-j);//for find all sub string

                charCount[s.charAt(i)-'a']--;
               i++;
            }
            j++;
        }
        return count;

        
    }
}