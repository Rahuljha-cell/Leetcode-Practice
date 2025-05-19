class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length, start = 0, end = n - 1;
        int ans[] = new int[n];
        for (int i = n - 1; i>=0; i--) {
            if (Math.abs(nums[start]) >= Math.abs(nums[end])) {
                ans[i] = nums[start] * nums[start];
                start++;
            } 
            else {
                ans[i] = nums[end] * nums[end];
                end--;
            }
        }
        return ans;
    }
}