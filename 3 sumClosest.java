class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i+1, k = nums.length - 1;
            while (j < k) {
                int currsum = nums[i] + nums[j] + nums[k];
                if (Math.abs(currsum - target) < Math.abs(closest - target)) {
                    closest = currsum;
                }
                if (currsum < target) {
                    j++;
                } else if (currsum > target) {
                    k--;
                } else {
                    return target;
                }   
            }
        }
        return closest;
    }
}