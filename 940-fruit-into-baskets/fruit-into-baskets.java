class Solution {
    public int totalFruit(int[] fruits) {
        int i = 0, j = 0;
        int k = 2;
        int n = fruits.length;
        int max = 0;
        if (n == 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        while (j < n) {
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

            if (map.size() <= k) {
                max = Math.max(max, j - i + 1);
                j++;
            } else {
                while (map.size() > k) {
                    int leftFruit = fruits[i];
                    map.put(leftFruit, map.get(leftFruit) - 1);
                    if (map.get(leftFruit) == 0) {
                        map.remove(leftFruit);
                    }
                    i++;
                }
                j++;
            }
        }

        return max;
    }
}