class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> scounter = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            scounter.put(ch, 1 + scounter.getOrDefault(ch, 0));
        }

        for (int  j = 0; j < t.length(); j++) {
            char ch = t.charAt(j);
            if (!scounter.containsKey(ch) || scounter.get(ch) == 0) {
                return false;
            }
            scounter.put(ch, scounter.get(ch) - 1);
        }
        return true;
    }
}