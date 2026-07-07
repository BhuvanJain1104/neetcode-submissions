class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        Deque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[nums.length - k + 1];
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {

            // Remove indices that are outside the current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements from the back
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            // Start recording answers once the first window is formed
            if (i >= k - 1) {
                ans[idx++] = nums[dq.peekFirst()];
            }
        }

        return ans;
    }
}
