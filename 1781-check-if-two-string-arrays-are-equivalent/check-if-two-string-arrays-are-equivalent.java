class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n1=word1.length;
        int n2=word2.length;
        StringBuilder sb1=new StringBuilder(" ");
        StringBuilder sb2=new StringBuilder(" ");
        for(int i=0;i<n1;i++){
            sb1.append(word1[i]);
           
        }
         for(int i=0;i<n2;i++){
            sb2.append(word2[i]);
        }
        return (sb1.toString().equals (sb2.toString()));
        
    }
}