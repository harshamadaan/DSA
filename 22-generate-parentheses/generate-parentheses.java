class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        int open=n;
        int close=n;
        String op="";
        solve(open,close,op,result);
        return result;

        
    }
    void solve(int open,int close,String op, List<String> result){
        if(open==0 && close==0){
            result.add(op);
            return;
        }
        if(open!=0){
            String op1=op;
            op1+="(";
            solve(open-1,close,op1,result);
        }
        if(close>open){
            String op2=op;
            op2+=")";
            solve(open,close-1,op2,result);
        }
        
    }
}