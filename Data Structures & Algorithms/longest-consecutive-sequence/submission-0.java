class Solution {
           public static int longestConsecutive(int[] nums) {
        if(nums.length!=0){
            Arrays.sort(nums);
            int count = 1;
            int result = 0;
            int n = nums.length - 1;
            int i = 0;
            int current = nums[0];
            while (i <= n) {
                if (nums[i] == current)
                    i++;
                else if (nums[i] == current + 1) {
                    count++;
                    current = nums[i];
                    i++;
                } else {
                    count = 1;
                    current = nums[i];
                    i++;
                }
                result = Math.max(result, count);
            }
            return result;
        }
        return 0;
    }
}
