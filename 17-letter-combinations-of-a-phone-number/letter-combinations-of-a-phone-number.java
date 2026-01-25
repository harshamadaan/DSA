import java.util.*;

class Solution {

    private void helper(int idx, String digits,
                        Map<Character, String> map,
                        StringBuilder currStr,
                        List<String> ans) {

        // base case
        if (idx == digits.length()) {
            ans.add(currStr.toString());
            return;
        }

        // current digit
        char ch = digits.charAt(idx);

        // corresponding letters
        String letters = map.get(ch);

        for (char letter : letters.toCharArray()) {
            currStr.append(letter);                 // choose
            helper(idx + 1, digits, map, currStr, ans); // explore
            currStr.deleteCharAt(currStr.length() - 1); // backtrack
        }
    }

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        // edge case
        if (digits == null || digits.length() == 0)
            return ans;

        // digit → letter mapping
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        helper(0, digits, map, new StringBuilder(), ans);
        return ans;
    }
}
