class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);  // Step 1: Array ko chhote se bade mein sort karo
        int count = 0;
        int n = nums.length;

        // Step 2: Pehla element fix karo
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;      // Doosra pointer
            int k = n - 1;      // Teesra pointer

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum < target) {
                    // Agar sum target se chhota hai
                    // to j se k tak ke sabhi combinations valid hain
                    count += (k - j);  // (j, j+1, ..., k-1) sabhi valid
                    j++;  // aage badho
                } else {
                    k--;  // sum zyada ho gaya, peeche aao
                }
            }
        }
        return count;  // total valid triplets
    }
}
