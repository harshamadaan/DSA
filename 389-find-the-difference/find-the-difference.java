class Solution {
    //1st method
    public char findTheDifference(String s, String t) {
        // int[] freq=new int[26];
        // for(int i=0;i<s.length();i++){
        //     freq[s.charAt(i)-'a']++;
        // }
        // for(int i=0;i<t.length();i++){
        //     freq[t.charAt(i)-'a']--;
        // }
        // for(int i=0;i<26;i++){
        //     if(freq[i]<0){
        //     return(char)(i+'a');
        // }

        // }
        // return ' ';

        //2nd
        int XOR=0;
        for(int i=0;i<s.length();i++){
            XOR^=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            
            XOR^=t.charAt(i);
        }
        return (char)(XOR);
        
        
    }
}