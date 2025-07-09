import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] present = new boolean[1001];
        boolean[] added = new boolean[1001];
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums1) {
            present[num] = true;
        }

        for (int num : nums2) {
            if (present[num] && !added[num]) {
                list.add(num);
                added[num] = true; 
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}
