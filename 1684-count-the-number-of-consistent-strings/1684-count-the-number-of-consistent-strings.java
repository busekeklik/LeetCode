class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedSet = new HashSet<>();
        for(char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }
        int consistentCount = 0;
        for(String word:words) {
            boolean consistent = true;
            for(char c:word.toCharArray()) {
                if(!allowedSet.contains(c)) {
                    consistent = false;
                    break;
                }
            }
            if(consistent) {
                consistentCount++;
            }
        }
        return consistentCount;
    }
}