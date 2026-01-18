class Solution {
    HashMap<String,Boolean>map=new HashMap<>();
    public boolean solve(String s1, String s2){
        if(s1.equals(s2)){
            return true;
        }
        String key=s1+" "+s2;
        if(map.containsKey(key)){
            return map.get(key);
        }
        int n=s1.length();
        boolean flag=false;
        for(int i=1;i<=n-1;i++){
            boolean isSwap=solve(s1.substring(0,i),s2.substring(n-i))
            && solve(s1.substring(i),s2.substring(0,n-i));

            boolean isnonSwap=solve(s1.substring(0,i),s2.substring(0,i))
            && solve(s1.substring(i),s2.substring(i));

            if(isSwap || isnonSwap){
                flag=true;
                break;
            }
        }
        map.put(key,flag);
        return flag;

    }
    public boolean isScramble(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        if(s1.length()==0 && s2.length()==0){
            return true;
        }
        return solve(s1,s2);
        
    }
}