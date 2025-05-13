class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {return false;}
        HashMap<Character, Integer> scount = new HashMap<>();
        HashMap<Character, Integer> tcount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            scount.put(s.charAt(i), 1 + scount.getOrDefault(s.charAt(i), 0));
            tcount.put(t.charAt(i), 1 + tcount.getOrDefault(t.charAt(i), 0));
        }
        return scount.equals(tcount);

    }
}