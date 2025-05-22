class Solution {
    public void sortColors(int[] nums) {
        int red = 0, white = 0, blue = nums.length-1;
        while (white <= blue) {
            if (nums[white] == 0) {
                int temp = nums[white];
                nums[white] = nums[red];
                nums[red] = temp;
                white++;
                red++;
            } else if (nums[white] == 1) {
                white++;
            }
            else {
                int temp = nums[white];
                nums[white] = nums[blue];
                nums[blue] = temp;
                blue--;
            }
        }
    }
}

// 2nd solution

class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        count.put(0, 0);
        count.put(1, 0);
        count.put(2, 0);
        for (int num : nums) {
            count.put(num, count.get(num) + 1);
        }
        int idx = 0;
        for (int color = 0; color < 3; color++) {
            int freq = count.get(color);
            for (int j = 0; j < freq; j++) {
                nums[idx] = color;
                idx++;
            }
        }
    }
}