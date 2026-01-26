class Solution {
    List<String> ans=new ArrayList<>();
    private void helper(String s,int idx,Set<String> dict,List<String> temp){
        //bc
        if(idx==s.length()){
            ans.add(String.join(" ",temp));
            return;
        }
        String word="";
        //try all substring
        for(int i=idx;i<s.length();i++){
            word+=s.charAt(i);
            if(dict.contains(word)){
                temp.add(word);
                helper(s,i+1,dict,temp);
                //explore backtrack
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> dict=new HashSet<>(wordDict);
        helper(s,0,dict,new ArrayList<>());
        return ans;
        
    }
}