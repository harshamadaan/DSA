class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> ans=new HashSet<>();
        for(char ch='a';ch<='z';ch++){
            ans.add(ch);
        }
        int n=sentence.length();
        for(int i=0;i <n;i++){
            char ch=sentence.charAt(i);
            ans.remove(ch);
            if(ans.isEmpty()){
                return true;
            }

        }
        return false;
        
    }
}