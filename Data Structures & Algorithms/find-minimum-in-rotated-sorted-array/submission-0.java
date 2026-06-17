class Solution {
    
      
    public int findMin(int[] nums) {
         int minIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }
        return nums[minIndex];
    }
}
    

