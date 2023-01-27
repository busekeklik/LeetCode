class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum, max = 0;
        int rowLen = accounts.length;
        int colLen = accounts[0].length;

        for(int i = 0; i < rowLen; i++)
        {
            sum = 0;
            for(int j = 0; j < colLen; j++)
            {
                sum += accounts[i][j];
            }
            if (sum > max){
                max = sum;
            }
        }
        return max;
    }
}