class Solution {
    List<List<String>> ans=new ArrayList<>();
    //check palindrome
    private boolean isPalindrome(String s){
        int n=s.length();
        int st=0,end=n-1;
        while(st<end){
            if(s.charAt(st)!=s.charAt(end))
            return false;
            st++;
            end--;
        }
        return true;
    }
    //backtrack helper
    private void helper(String s,int idx,List<String>temp){
        if(idx== s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        String palString="";
        //all substring
        for(int i=idx;i< s.length();i++){
            palString+=s.charAt(i);
            if(isPalindrome(palString)){
                temp.add(palString);
                helper(s,i+1,temp);
                //backtrack
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        helper(s,0,new ArrayList<>());
        return ans;
        
    }
}