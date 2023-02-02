class Solution {
    public int minPartitions(String n) {
        int size = n.length();
        char maxChar = '0';
        for (int i = 0; i < size; i++) {
            if (n.charAt(i) > maxChar) {
                maxChar = n.charAt(i);
            }
        }

        return Integer.parseInt(String.valueOf(maxChar));
    }
}