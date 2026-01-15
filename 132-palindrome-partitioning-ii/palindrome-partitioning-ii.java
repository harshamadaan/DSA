import java.util.*;

class Solution {

    Integer[][] dp;

    // Check if substring is palindrome
    boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Recursive function
    int solve(String str, int i, int j) {

        // Base case
        if (i >= j) {
            return 0;
        }

        // Memoization
        if (dp[i][j] != null) {
            return dp[i][j];
        }

        // If whole substring is palindrome
        if (isPalindrome(str, i, j)) {
            dp[i][j] = 0;
            return 0;
        }

        int min = Integer.MAX_VALUE;

        // Try all partitions
        for (int k = i; k < j; k++) {

            // IMPORTANT optimization:
            // Only cut if left part is palindrome
            if (isPalindrome(str, i, k)) {
                int cuts = 1 + solve(str, k + 1, j);
                min = Math.min(min, cuts);
            }
        }

        dp[i][j] = min;
        return min;
    }

    public int minCut(String s) {
        int n = s.length();
        dp = new Integer[n][n];
        return solve(s, 0, n - 1);
    }
}
