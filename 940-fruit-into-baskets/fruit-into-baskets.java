// class Solution {
//     public int totalFruit(int[] fruits) {
//         int i = 0, j = 0;
//         int k = 2;
//         int n = fruits.length;
//         int max = 0;
//         if (n == 0) return 0;

//         HashMap<Integer, Integer> map = new HashMap<>();

//         while (j < n) {
//             map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

//             if (map.size() <= k) {
//                 max = Math.max(max, j - i + 1);
//                 j++;
//             } else {
//                 while (map.size() > k) {
//                     int leftFruit = fruits[i];
//                     map.put(leftFruit, map.get(leftFruit) - 1);
//                     if (map.get(leftFruit) == 0) {
//                         map.remove(leftFruit);
//                     }
//                     i++;
//                 }
//                 j++;
//             }
//         }

//         return max;
//     }
// }



//or cuz we need to check only> case

class Solution {
    public int totalFruit(int[] fruits) {
        int i = 0, j = 0;
        int n = fruits.length;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (j < n) {
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

            // If more than 2 fruit types, shrink the window
            while (map.size() > 2) {
                int leftFruit = fruits[i];
                map.put(leftFruit, map.get(leftFruit) - 1);
                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }
                i++;
            }

            // Window is valid: update max
            max = Math.max(max, j - i + 1);
            j++;
        }

        return max;
    }
}
