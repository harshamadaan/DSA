class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];  
        int maxFreq = 0;           
        int maxWindow = 0;        
        int i = 0, j = 0;          
        int n = s.length();

        while (j < n) {
           
            freq[s.charAt(j) - 'A']++;

           
            maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'A']);

            
            int windowLen = j - i + 1;

            
            if (windowLen - maxFreq > k) {
                freq[s.charAt(i) - 'A']--; 
                i++; 
            }

            
            maxWindow = Math.max(maxWindow, j - i + 1);


            j++;
        }

        return maxWindow;
    }
}
