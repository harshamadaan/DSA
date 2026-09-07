class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();

        for(String token:tokens){
            if(isOperator(token)){
                int b=st.pop(); // sec operand
                int a=st.pop(); // ist 
                int result=applyOperator(token,a,b);
                st.push(result);
            }else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
    private boolean isOperator(String token){
        return token.equals("+") || token.equals("-") || token.equals("*")|| token.equals("/");
    }
    private int applyOperator(String operator,int a,int b){
        switch(operator){
            case "+": return a+b;
            case "-": return a-b;
            case"*": return a*b;
            case"/": return a/b;
            default: throw new IllegalArgumentException("Invalid operator");
        }
    }
}