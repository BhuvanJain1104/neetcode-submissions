class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;  }
            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;   // search left
                } else {
                    start = mid + 1; // search right
                }
            }
            else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1; // search right
                } else {
                    end = mid - 1;   // search left
                }
            }
        }
        return -1; // not found
    }
}
