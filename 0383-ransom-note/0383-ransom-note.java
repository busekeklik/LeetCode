class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;
        HashMap<Character, Integer> charCounts = new HashMap();
        for (char c : magazine.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (!charCounts.containsKey(c) || charCounts.get(c) <= 0)
                return false;
            charCounts.put(c, charCounts.get(c) - 1);
        }
        
        return true;  
    }
}