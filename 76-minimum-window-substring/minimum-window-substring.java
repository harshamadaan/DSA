class Solution {
    public String minWindow(String s, String t) {
     if(t.length()>s.length()) return "";
     HashMap<Character,Integer> map=new HashMap<>();
     for(int i=0;i<t.length();i++){
        char ch=t.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
     }
     int i=0,j=0;
     int count=map.size();
     int ans=Integer.MAX_VALUE;
     String finalAns="";

     while(j<s.length()){
        char ch=s.charAt(j);
        if(!map.containsKey(ch)){
            j++;
        }else{
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0){
                count--;
            }
            while(count==0){
                if(ans>j-i+1){
                    ans=j-i+1;
                    finalAns=s.substring(i,i+ans);
                }
                char leftChar=s.charAt(i);
                if(map.containsKey(leftChar)){
                    map.put(leftChar,map.get(leftChar)+1);
                    if(map.get(leftChar)>0){
                        count++;
                    }
                }
                i++;
            }
            j++;
        }
     } 
     return finalAns;  
    }
}