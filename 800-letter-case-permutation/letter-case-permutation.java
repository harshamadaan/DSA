class Solution {
    public List<String> letterCasePermutation(String s) {

    ArrayList<String> res=new ArrayList<>();
    solve(s,"",res);
    return res;
    
        
    }
    private void solve(String ip,String op,List<String>res){
        if(ip.length()==0){
            res.add(op);
            return;
        }
        char ch=ip.charAt(0);
        ip=ip.substring(1);
        
        if(Character.isLetter(ch)){
            String op1=op+Character.toLowerCase(ch);
            String op2=op+Character.toUpperCase(ch);

            solve(ip,op1,res);
            solve(ip,op2,res);
        }else{
            String op1=op+ch;
            solve(ip,op1,res);

        }
    }
}