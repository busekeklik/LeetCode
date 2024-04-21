class Solution {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }     
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
            
            if (charToWord.containsKey(ch)) {
                if (!charToWord.get(ch).equals(word)) {
                    return false;
                }
            } else if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != ch) {
                    return false;
                }
            } else {
                charToWord.put(ch, word);
                wordToChar.put(word, ch);
            }
        }
        return true;
    }
}