class Solution {
    public int compress(char[] chars) {
        int ans = 0;
        for (int i = 0; i < chars.length;) {
            int count = 0;
            final char letter = chars[i];
            while (i < chars.length && chars[i] == letter) {
                count++;
                i++;
            }
            chars[ans++] = letter;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[ans++] = c;
                }
            }
        }
        return ans;
    }
}