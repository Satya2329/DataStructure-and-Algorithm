package Arrays_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }
        
        // Sort intervals based on their starting times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);
        
        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextBegin = interval[0];
            int nextEnd = interval[1];
            
            if (nextBegin <= currentEnd) {
                // Overlapping intervals, update the current interval's end time
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // Disjoint interval, move to the next tracking interval
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }
        
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        Solution solver = new Solution();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        
        int[][] result = solver.merge(intervals);
        
        System.out.println("Merged intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
