import java.util.*;

public class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int i = 0, n = events.length;
        int day = 0, count = 0;
        while (i < n || !minHeap.isEmpty()) {
            if (minHeap.isEmpty()) {
              
                day = events[i][0];
            }
            while (i < n && events[i][0] <= day) {
                minHeap.add(events[i][1]);
                i++;
            }
            while (!minHeap.isEmpty() && minHeap.peek() < day) {
                minHeap.poll();
            }
            if (!minHeap.isEmpty()) {
                minHeap.poll();
                count++;
                day++;
            }
        }

        return count;
    }
}
