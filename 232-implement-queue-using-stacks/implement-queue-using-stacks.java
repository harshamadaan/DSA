class MyQueue {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> helper=new Stack<>();


    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.push(x);
        
    }
    
    public int pop() {
        //st ka bottom remove
        while(st.size()>1){
            helper.push( st.pop());
            
        }
        int front=st.pop(); //store in front cuz int type function h upr
        while(helper.size()>0){
            st.push(helper.pop());
            
        }
        return front;
        
    }
    
    public int peek() {
        while(st.size()>1){
            helper.push(st.pop());
            
        }
        int front=st.peek(); //store in front cuz int type function h upr
        while(helper.size()>0){
            st.push(helper.pop());
            
        }
        return front;
        
    }
    
    public boolean empty() {
        return(st.size()==0);
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */