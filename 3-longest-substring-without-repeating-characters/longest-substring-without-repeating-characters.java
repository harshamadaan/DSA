class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        while(j<n){              // in this map.size()>j-i+! never hit cuz if window 4 ki h to usma max uniwue character 4 hi aa skta h
           char ch=s.charAt(j);
           map.put(ch,map.getOrDefault(ch,0)+1);  
           if (map.size() == j - i + 1) {
                max = Math.max(max, j - i + 1);
                j++;
            }

            // CASE 2: Duplicate characters found — shrink window
            else if (map.size() < j - i + 1) {
                while (map.size() < j - i + 1) {
                    char leftChar = s.charAt(i);
                    map.put(leftChar, map.get(leftChar) - 1);
                    if (map.get(leftChar) == 0) {
                        map.remove(leftChar);
                    }
                    i++;
                }
                j++;
            }
        }

        return max;
    }
}

          