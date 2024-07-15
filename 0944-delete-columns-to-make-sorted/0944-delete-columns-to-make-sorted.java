class Solution {
    public int minDeletionSize(String[] strs) {
        int length = strs[0].length();
        int count = 0;
        for(int col = 0; col < length; col++) {
            char prev = '0';
            for(String str : strs){
                char cur = str.charAt(col);
                if(cur < prev){
                    count++;
                    break;
                }
                prev = cur;
            }
        }
        return count;
    }
}