class Solution {
    public int minTimeToType(String word) {
        int count = word.length();
        char prev = 'a';
        for(int i = 0; i < word.length(); i++){
            char cur = word.charAt(i);
            int diff = Math.abs(cur - prev);
            count += Math.min(diff, 26 - diff);
            prev = cur;
        }
        return count;
    }
}