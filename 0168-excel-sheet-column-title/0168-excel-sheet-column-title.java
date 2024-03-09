class Solution {
    public String convertToTitle(int columnNumber) {
        String ans = "";
        while (columnNumber > 0){
            int r = columnNumber % 26;
            columnNumber = (columnNumber - 1) / 26;
            r--;
            if(r < 0)
                r = 25;
            char c = (char)('A' + r);
            ans = c+ans;
        }
        return ans;
    }
}