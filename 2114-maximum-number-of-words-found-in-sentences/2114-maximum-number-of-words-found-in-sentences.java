class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        for(String s : sentences){
            int len = s.split(" ").length;
            count = Math.max(len, count);
        }
        return count;
    }
}