class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        if(n1>n2) return false;
        int[] freq1=new int[26];
        for(int i=0;i<n1;i++){
            freq1[s1.charAt(i)-'a']++;
        }
        int [] freq2=new int[26];
        int i=0,j=0;
        while(j<n2){
            freq2[s2.charAt(j)-'a']++;

            if(j-i+1 == n1){
                if(Arrays.equals(freq1,freq2)){
                    return true;
                }
            }
            if(j-i+1<n1){
                j++;
            }else{
                freq2[s2.charAt(i)-'a']--;
                i++;
                j++;
            }

        }
        return false;
       
        
    }
}