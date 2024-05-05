class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> charCounts = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (charCounts.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}