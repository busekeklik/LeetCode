class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = s.charAt(i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : arr) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}