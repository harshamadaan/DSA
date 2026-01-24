class Solution {
    List<List<String>> ans=new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        //initialize board with .
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        helper(0,board,n);
        return ans;
        
    }
    //col wise traversal
    private void helper(int col,char[][] board,int n){
        //base call
        if(col==n){
            ans.add(construct(board));
            return;
        }
        //try place queen in each row
        for(int row=0;row<n; row++){
            if(check(row,col,board,n)){
                board[row][col]='Q';
                //col ko ek aga bda do
                helper(col+1,board,n);
                //undo backtrack
                board[row][col]='.';
            }
        }
    }
    //check if queen can place row,col
    private boolean check(int row,int col,char[][] board,int n){
        //check same row left side
        for(int j=0;j<col;j++){
            if(board[row][j]=='Q') return false;
        }
        //cheack uppr left diagonal
        int i=row,j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;j--;
        }
        //check lowr left diagonal
         i=row;j=col;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;j--;
        }
        return true;

    }
    private List<String> construct(char[][] board){
        List<String> res=new ArrayList<>();
        for(char[] row: board){
            res.add(new String(row));
        }
        return res;
    }
}