class Solution {
    public int maxVowels(String s, int k) {

        int i = 0, j = 0;
        int maxCount = 0;
        int count = 0;

        while (j < s.length()) {

            // Step 1: include current character
            if (isVowel(s.charAt(j))) {
                count++;
            }

            // Step 2: if window size < k → expand
            if (j - i + 1 < k) {
                j++;
            }

            // Step 3: if window size == k
            else if (j - i + 1 == k) {

                maxCount = Math.max(maxCount, count);

                // Slide window (remove left char)
                if (isVowel(s.charAt(i))) {
                    count--;
                }

                i++;
                j++;
            }
        }

        return maxCount;
    }

    private boolean isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
