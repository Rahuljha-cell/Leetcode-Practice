class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            if (count.get(num) <= 2) {
                nums[k] = num;
                k++;
            }
        }
        return k;
    }
}

//solution 2
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k-2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}