class Solution {
    public long countOfSubstrings(String word, int k) {
        return atleast(word, k) - atleast(word, k +1);
    }

    private boolean isConsonant(char ch) {
        return (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u');
    }

    private boolean isAllVowelPresent(int[] freq) {
        return (freq['a' - 'a'] > 0 && freq['e' - 'a'] > 0 &&
                freq['i' - 'a'] > 0 && freq['o' - 'a'] > 0 && freq['u' - 'a'] > 0);
    }

    private long atleast(String word, int k) {
        long count = 0;
        int currConsonant = 0;
        int[] freq = new int[26];
        int n = word.length();
        int i = 0;

        for (int j = 0; j < n; j++) { // ✅ safer than while
            char ch = word.charAt(j);
            if (isConsonant(ch)) currConsonant++;
            freq[ch - 'a']++;
        

            // shrink window if consonants exceed limit
        //     while (currConsonant > k && i <= j) {
        //         char c = word.charAt(i);
        //         if (isConsonant(c)) currConsonant--;
        //         freq[c - 'a']--;
        //         i++;
        //     }

        //     // count valid substrings
        //     if (isAllVowelPresent(freq)) {
        //         count += i + 1;
        //     }
        // }
        while(currConsonant >=k && isAllVowelPresent(freq)){
            count+=(n-j);
            char c=word.charAt(i);
            if(isConsonant(c)){
                currConsonant--;
            }
            freq[c-'a']--;
            i++;
        }
    }

        return count;
    }
}
