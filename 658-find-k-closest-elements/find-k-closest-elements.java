import java.util.*;

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        // Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> {
                int diff1 = Math.abs(a - x);
                int diff2 = Math.abs(b - x);

                // larger distance first (max heap)
                if (diff1 == diff2)
                    return b - a;   // larger number removed first

                return diff2 - diff1;
            }
        );

        for (int num : arr) {
            pq.offer(num);

            // keep only k closest
            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<Integer> ans = new ArrayList<>(pq);

        // required output sorted
        Collections.sort(ans);

        return ans;
    }
}