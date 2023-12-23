class Solution {
    public String replaceDigits(String s) {
        char[] ch = s.toCharArray();
        for (int i = 1; i < s.length(); i += 2) {
            ch[i] = (char) (ch[i - 1] + (ch[i] - '0'));
        }
        return new String(ch);
    }
}
