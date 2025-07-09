import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);  // Step 1: Sort the array

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {   // ✅ Check duplicates
                return true;               // Return if duplicate found
            }
        }

        return false;  // ✅ Only return false after checking all elements
    }
}
