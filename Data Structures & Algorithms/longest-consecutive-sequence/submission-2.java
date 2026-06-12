class Solution {


public static int longestConsecutive(int[] nums) {

    if (nums.length == 0)
        return 0;

    HashSet<Integer> set = new HashSet<>();

    // Add all numbers to the set
    for (int num : nums) {
        set.add(num);
    }

    int longest = 0;

    // Check every number
    for (int num : set) {

        // Only start if there is no previous number
        if (!set.contains(num - 1)) {

            int current = num;
            int length = 1;

            while (set.contains(current + 1)) {
                current++;
                length++;
            }

            longest = Math.max(longest, length);
        }
    }

    return longest;
}
}
