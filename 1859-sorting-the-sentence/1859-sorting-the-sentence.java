class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] sorted = new String[str.length];

        for (String a : str) {
            int len = a.length();
            int i = a.charAt(len - 1) - '0';
            sorted[i - 1] = a.substring(0, len - 1);
        }
        return String.join(" ", sorted);
    }
}