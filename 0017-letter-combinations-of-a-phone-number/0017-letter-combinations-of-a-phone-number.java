class Solution {
    private static final String[] LETTERS = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();
        if (digits.isEmpty()) {
            return results;
        }
        combineLetters(digits, 0, "", results);
        return results;
    }

    private void combineLetters(String digits, int index, String current, List<String> results) {
        if (index == digits.length()) {
            results.add(current);
            return;
        }
        String letters = LETTERS[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            combineLetters(digits, index + 1, current + letter, results);
        }
    }
}