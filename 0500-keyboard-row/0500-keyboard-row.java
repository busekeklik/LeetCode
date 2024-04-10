class Solution {
    public String[] findWords(String[] words) {
        int[]rows = new int['z'-'A'+1];
        for (char c: "qwertyuiopQWERTYUIOP".toCharArray()) rows[c-'A'] = 1;
        for (char c: "asdfghjklASDFGHJKL".toCharArray()) rows[c-'A'] = 2;
        for (char c: "zxcvbnmZXCVBNM".toCharArray()) rows[c-'A'] = 3;
        List<String> res = new ArrayList<>();
        for (String word: words) checkWord(word, res,rows);
        return res.toArray(new String[res.size()]);
    }
    
    public void checkWord(String word, List<String> res, int[]rows){
        int currentRow = rows[word.charAt(0)-'A'];
        for (char c: word.toCharArray()){
            if (rows[c-'A']!=currentRow){
                return;
            }
        }
        res.add(word);
    }
}